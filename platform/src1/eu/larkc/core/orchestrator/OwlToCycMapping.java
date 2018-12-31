package eu.larkc.core.orchestrator;

import java.util.Hashtable;

public class OwlToCycMapping {
	
	private Hashtable<String, String> mapping;
	
	public OwlToCycMapping() {
		// prepare mappings
		mapping = new Hashtable<String, String>();
		mapping.put("http://www.w3.org/2000/01/rdf-schema#Class", "Collection");
		mapping.put("http://www.w3.org/1999/02/22-rdf-syntax-ns#type", "isa");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#subClassOf", "genls");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#domain", "arg1Isa");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#range", "arg2Isa");
		mapping.put("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property", "BinaryPredicate");
		mapping.put("http://www.w3.org/2002/07/owl#TransitiveProperty", "TransitiveBinaryPredicate");
		mapping.put("http://www.w3.org/2001/XMLSchema#string", "CharacterString");
		
		mapping.put("http://www.w3.org/2000/01/rdf-schema#isDefinedBy", "containsInformationAbout");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#label", "prettyString");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#comment", "comment");
		mapping.put("http://www.w3.org/2000/01/rdf-schema#Resource", "Thing");
		
		//the mapping to those two is missing in the rdf
		mapping.put("http://larkc.eu/plugin#genlrange", "arg2Genl");
		mapping.put("http://larkc.eu/plugin#genldomain", "arg1Genl");
	}
	
	public boolean isCycEquivalent(String rdfTerm) {
		return mapping.containsKey(rdfTerm);
	}
	
	public String getCycEquivalent(String rdfTerm) {
		if (mapping.containsKey(rdfTerm)) {
			return mapping.get(rdfTerm);
		}
		return null;
	}
	
	public String toCycConst(String rdfTerm) {
		// first we make the string pretty for known name-spaces
		rdfTerm = rdfTerm.replaceFirst("http://larkc.eu/plugin#", "larkc-");
		rdfTerm = rdfTerm.replaceFirst("http://www.wsmo.org/ns/wsmo-lite#", "wsl-");
		// make it pretty if still necessary
		final int len = rdfTerm.length();
		StringBuffer cycConst = new StringBuffer();
		for (int chN = 0; chN < len; chN++) {
			char ch = rdfTerm.charAt(chN);
			if (Character.isLetter(ch)) { cycConst.append(ch); }
			else if (Character.isDigit(ch)) { cycConst.append(ch); }
			else if (ch == ':' || ch == '-' || ch == '_') { cycConst.append(ch); }
			else { cycConst.append('-'); }
		}
		return cycConst.toString();		
	}
	
}