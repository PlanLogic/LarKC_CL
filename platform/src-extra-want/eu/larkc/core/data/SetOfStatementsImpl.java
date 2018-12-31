package eu.larkc.core.data;
import java.util.ArrayList;
import java.util.Collection;

import org.openrdf.model.Statement;

import eu.larkc.core.data.CloseableIterator;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.data.iterator.SimpleCloseableIterator;

/**
 * This class is a in-memory set of RDF statements.
 * 
 * @author vassil
 *
 */
public class SetOfStatementsImpl implements SetOfStatements {

	private static final long serialVersionUID = 1L;
	private final Collection<Statement> data;

	public SetOfStatementsImpl(Iterable<Statement> data) {
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data = new ArrayList<Statement>();
		for (Statement st : data) {
			this.data.add(st);
		}
	}

	public SetOfStatementsImpl(Collection<Statement> data) {
		if (data == null) {
			throw new IllegalArgumentException();
		}
		this.data = new ArrayList<Statement>(data);
	}

	public CloseableIterator<Statement> getStatements() {
		return new SimpleCloseableIterator<Statement>(data.iterator());
	}

}
