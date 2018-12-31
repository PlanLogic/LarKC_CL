package eu.larkc.core.data;

import org.apache.log4j.Logger;
import org.openrdf.model.Statement;
import org.openrdf.model.URI;

import com.ontotext.ordi.Factory;
import com.ontotext.ordi.tripleset.TSource;

import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;

/**
 * This is a dummy factory to abstract ORDI creation specifics.
 * 
 * @author vassil
 * 
 */
public class DataFactoryImpl implements DataFactory {

	private static TSource ordi;
	private static Thread shutdownThread;
	private static Logger logger = Logger.getLogger(DataFactory.class);
	private static String NO_PERSIST = "eu.larkc.core.data.persistence";

	private DataFactoryImpl() {
	}

	public synchronized static DataFactoryImpl getInstance() {
		if (ordi == null) {
			String queryOptimize = System.getProperty("trree.optimization",
					"true");
			System.setProperty("trree.optimization", queryOptimize);
			ordi = Factory.createDefaultTSource();
			Runtime rt = Runtime.getRuntime();
			shutdownThread = new Thread() {
				public void run() {
					logger.info("Shutdown request is invoked!");
					String persist = System.getProperty(NO_PERSIST, "true");
					if (persist.equals("false")) {
						logger.info("No data persistence set!");
					}
					else {
						ordi.shutdown();
					}
				}
			};
			rt.addShutdownHook(shutdownThread);
		}
		return new DataFactoryImpl();
	}

	/**
	 * Creates a RDF graph that will be passed by value.
	 * 
	 * @param graph
	 *            name (may be null)
	 * @param sts
	 *            collection of the statements
	 * @return the graph
	 */
	public RdfGraph createRdfGraph(Iterable<Statement> sts, URI graph) {
		return new RdfGraphInMemory(graph, sts);
	}

	/**
	 * Creates RDF graph from a remote location. If the URI could not be
	 * resolved an exception will be generated during the construction of the
	 * graph.
	 * 
	 * @param uri
	 *            to be resolved
	 * @return the constructed rdf graph
	 */
	public RdfGraph createRemoteRdfGraph(URI uri) {
		return new HTTPRemoteGraph(uri);
	}

	/**
	 * Creates a connection to local storage.
	 * 
	 * @return a connection to the local store
	 */
	public RdfStoreConnection createRdfStoreConnection() {
		return new RdfStoreConnectionImpl(ordi.getConnection());
	}

	/**
	 * Create a connection to remote SPARQL endpoint. If the URI is not
	 * resolvable or SPARQL enabled service could not be found an exception will
	 * be generated after constructing the object.
	 * 
	 * @param uri
	 * @return
	 */
	public SPARQLEndpoint createSPARQLEndpoint(URI uri) {
		throw new UnsupportedOperationException(
				"The execution of remote SPARQL endpoints "
						+ "is still not supported! Please use "
						+ "createRdfStoreConnection() method instead!");
	}

	public SPARQLQuery createSPARQLQuery(String query) {
		return new SPARQLQueryImpl(query);
	}

	public SPARQLQuery createSPARQLQuery(String query, URI label) {
		SPARQLQuery sparql = createSPARQLQuery(query);
		sparql.setLabelledGroup(label);
		return sparql;
	}

	public SPARQLQuery createSPARQLQuery(String query, String ns, URI label) {
		SPARQLQuery sparql = new SPARQLQueryImpl(query, ns);
		sparql.setLabelledGroup(label);
		return sparql;
	}
}
