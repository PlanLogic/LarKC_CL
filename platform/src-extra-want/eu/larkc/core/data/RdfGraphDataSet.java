package eu.larkc.core.data;

import org.openrdf.model.Statement;
import org.openrdf.model.URI;
import org.openrdf.model.impl.ContextStatementImpl;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SPARQLEndpoint;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.core.query.SPARQLQueryImpl;

public class RdfGraphDataSet extends RdfGraphBase {

	private static final long serialVersionUID = 1L;
	private final SPARQLEndpoint endpoint;

	public RdfGraphDataSet(URI graph, SPARQLEndpoint endpoint) {
		super(graph);
		if (endpoint == null) {
			throw new IllegalArgumentException("null!");
		}
		this.endpoint = endpoint;
	}

	public CloseableIterator<Statement> getStatements() {
		String q = String.format(
				"construct {?s ?p ?o} FROM <%s> WHERE {?s ?p ?o}", getName());
		SPARQLQuery query = new SPARQLQueryImpl(q);
		CloseableIterator<Statement> inner = endpoint.executeConstruct(query)
				.getStatements();
		return new GraphCloseableIterator(getName(), inner);
	}

	public class GraphCloseableIterator implements CloseableIterator<Statement> {

		private URI graph;
		private CloseableIterator<Statement> inner;

		public GraphCloseableIterator(URI graph,
				CloseableIterator<Statement> inner) {
			if (inner == null || graph == null) {
				throw new IllegalArgumentException();
			}
			this.graph = graph;
			this.inner = inner;
		}

		public boolean hasNext() {
			return inner.hasNext();
		}

		public Statement next() {
			Statement s = inner.next();
			return new ContextStatementImpl(s.getSubject(), s.getPredicate(), s
					.getObject(), graph);
		}

		public void remove() {
			inner.remove();
		}

		public void close() {
			inner.close();
		}

		public boolean isClosed() {
			return inner.isClosed();
		}
	}
}
