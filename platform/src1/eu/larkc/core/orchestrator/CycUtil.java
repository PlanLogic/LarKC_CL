package eu.larkc.core.orchestrator;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import org.openrdf.model.Statement;
import org.openrdf.model.impl.URIImpl;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.RDFParseException;
import org.openrdf.rio.RDFParser;
import org.openrdf.rio.turtle.TurtleParserFactory;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;

import eu.larkc.core.data.iterator.RDFHandlerIterator;
import eu.larkc.core.metadata.PluginRegistry;

public class CycUtil {
	//private static Logger log = LoggerFactory.getLogger(CycUtil.class);
	private static Logger logger = Logger.getLogger(PluginRegistry.class.getCanonicalName());

	private static final OwlToCycMapping owlToCycMapping = new OwlToCycMapping();
	private static String mtStr = "BaseKB";
	//private static String uriFnStr = "LarkcURIFn";

	public static final void loadRdfTurtle(InputStream inputStream) throws RDFParseException, RDFHandlerException, IOException {
		// prepare infrastructure for storing URIs
		/*addConst(uriFnStr);
		addAssertion(CycUtil.toAssertion("isa", uriFnStr, "UnaryFunction"), mtStr);
		addAssertion(CycUtil.toAssertion("isa", uriFnStr, "ReifiableFunction"), mtStr);
		addAssertion(CycUtil.toAssertion("isa", uriFnStr, "IndividualDenotingFunction"), mtStr);
		addAssertion(CycUtil.toAssertion("arg1Isa", uriFnStr, "CharacterString"), mtStr);*/

		/*
		addConst("wsl-NonFunctionalParameter");
		addAssertion(CycUtil.toAssertion("isa", "wsl-NonFunctionalParameter", "Collection"), "UniversalVocabularyMt");
		addConst("larkc-Scalability");
		addAssertion(CycUtil.toAssertion("isa", "larkc-Scalability", "Collection"), "UniversalVocabularyMt");
		addConst("larkc-Scalability");
		addConst("wsl-NonFunctionalProperty");
		addAssertion(CycUtil.toAssertion("genls", "larkc-Scalability", "wsl-NonFunctionalProperty"), "UniversalVocabularyMt");
		*/

		// prepare turtle RDF format parser
		RDFParser parser =  new TurtleParserFactory().getParser();
		RDFHandlerIterator iter = new RDFHandlerIterator(new URIImpl("http://larkc.cyc/")) {

			@Override
			public void handleStatement(Statement st) throws RDFHandlerException {
				// make it into cyc assertion
				addRdfTriple(st);
			}

		};
		parser.setRDFHandler(iter);

		// start the parser
		parser.parse(inputStream, "http://larkc.cyc/");
	}

	public static final void addRdfTriple(Statement st) {
		// parse all three terms
		SubLObject subjectCycL = addRdfTerm(st.getSubject().toString());
		SubLObject predicateCycL = addRdfTerm(st.getPredicate().toString());
		SubLObject objectCycL = addRdfTerm(st.getObject().toString());
		// add it to the KB
		SubLObject cycAssertion = list(predicateCycL, subjectCycL, objectCycL);
		addAssertion(cycAssertion, mtStr);
	}

	public static final SubLObject addRdfTerm(String rdfTerm) {
		if (owlToCycMapping.isCycEquivalent(rdfTerm)) {
			// there is corresponding cyc term, we replace it
			return toConst(owlToCycMapping.getCycEquivalent(rdfTerm));
		} //else {
			// no corresponding cyc term, we add it to the KB using uriFn function
			//SubLObject nart = list(toConst(uriFnStr), makeString(rdfTerm));
			//System.out.println(nart);
			//addAssertion(nart, mtStr);
			//return nart;

		String cycConst = owlToCycMapping.toCycConst(rdfTerm);
		addConst(cycConst);
		return toConst(cycConst);
		//}
	}


	/**
	 * Adds the new constant to the kb. The constant name have to be the correct Cycl string
	 * TODO: Change to proper call, which checks if constant already there.
	 * @param constStr
	 */
	public static final void addConst(String constStr) {
		// TODO: ask Tony if this is a good and/or faster way to add
		// constants when you're not sure it exists

		SubLObject constSubL = toConst(constStr);
		if (constSubL instanceof constant_handles.$constant_native) {
			constant_handles.$constant_native constant = (constant_handles.$constant_native)constSubL;
			if (constant.$suid == SubLNil.NIL) {
				logger.fine("adding constant"+ constStr);
				ke.ke_create_now(makeString(constStr), CommonSymbols.UNPROVIDED);
			}
		}
	}

	public static final void addAssertion(String assertionStr, String _mtStr) {
		SubLObject mt = CycUtil.toConst(_mtStr);
		addAssertion(CycUtil.toAssertion(assertionStr), mt);
	}

	public static final void addAssertion(String assertionStr, SubLObject mt) {
		addAssertion(CycUtil.toAssertion(assertionStr), mt);
	}

	public static final void addAssertion(SubLObject assertion, String _mtStr) {
		logger.fine("adding assertion"+ assertion);
		//System.out.println(assertion);
		SubLObject mt = CycUtil.toConst(_mtStr);
		addAssertion(assertion, mt);
	}

	public static final void addAssertion(SubLObject assertion, SubLObject mt) {
		//System.err.println("--------------------ASSERTION: " + assertion);
		ke.ke_assert_now(assertion, mt, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
	}

	public static final void addForwardRule(String forwardRuleStr, String _mtStr) {
		SubLObject mt = CycUtil.toConst(_mtStr);
		addForwardRule(forwardRuleStr, mt);
	}

	public static final void addForwardRule(String forwardRuleStr, SubLObject mt) {
		// TODO: this rule only works if added after plug-ins' info already in the KB!
		ke.ke_assert_now(CycUtil.toAssertion(forwardRuleStr), mt,
		    CommonSymbols.UNPROVIDED, makeKeyword("FORWARD"));
	}

	public static final SubLObject askQuery(String queryStr) {
		return askQuery(queryStr, false);
	}

	public static final SubLObject askQuery(String queryStr, boolean browsable) {
		SubLObject parameters = SubLNil.NIL;
		if (browsable) {
			parameters = SubLObjectFactory.makeList(new SubLObject[] {
					makeKeyword("BROWSABLE?"), CommonSymbols.T });
		}
		// prepare the query
		SubLObject cycQuery = reader.read_from_string(makeString(queryStr),
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
		// execute the query
		return inference_kernel.new_cyc_query(cycQuery, constant_handles
				.reader_make_constant_shell(makeString("InferencePSC")),
				parameters);
	}

	// Platform code beautifier
	public static final SubLObject toConst(String s) {
		return constant_handles.reader_make_constant_shell(makeString(s));
	}

	// Platform code beautifier
	public static final SubLObject toAssertion(String s1, String s2, String s3) {
		return list(toConst(s1), toConst(s2), toConst(s3));
	}

	// platform code beautifier
	public static final SubLObject toAssertion(String s1, String s2, int i3, String s4) {
		return list(toConst(s1), toConst(s2),
				SubLNumberFactory.makeInteger(i3), toConst(s4));
	}

	// platform code beautifier
	public static final SubLObject toAssertion(String sentence) {
		return reader.read_from_string(makeString(sentence),
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
	}

}
