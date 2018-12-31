package eu.larkc.core.data;

import org.openrdf.model.URI;

import eu.larkc.core.data.RdfGraph;

/**
 * This class is an abstract representation of RDF graph.
 * 
 * @author vassil
 * 
 */
public abstract class RdfGraphBase implements RdfGraph {

	private URI name;

	public RdfGraphBase(URI name) {
		if (name == null) {
			throw new IllegalArgumentException("null!");
		}
		this.name = name;
	}

	public URI getName() {
		return name;
	}
	
	public String toString() {
		return name.stringValue();
	}
}
