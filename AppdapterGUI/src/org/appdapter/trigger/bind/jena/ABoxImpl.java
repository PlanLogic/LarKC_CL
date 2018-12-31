package org.appdapter.trigger.bind.jena;

import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLogger;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.api.trigger.MutableBox;
import org.appdapter.bind.rdf.jena.assembly.KnownComponentImpl;
import org.appdapter.api.trigger.Trigger;

public abstract class ABoxImpl<TrigType extends Trigger<? extends ABoxImpl<TrigType>>> extends KnownComponentImpl implements MutableBox<TrigType>
{
    private BoxContext myBoxContext;
    static Logger theLogger;
    private List<TrigType> myTriggers;
    
    public ABoxImpl() {
        this.myTriggers = new ArrayList<TrigType>();
    }
    
    public Logger getLogger() {
        return ABoxImpl.theLogger;
    }
    
    public Logger getALogger() {
        return ABoxImpl.theLogger;
    }
    
    public static Logger getSLogger() {
        return ABoxImpl.theLogger;
    }
    
    public void useLoggerForClass(final Class c) {
        final Logger l = getLoggerForClass(c);
        this.setLogger(l);
    }
    
    protected boolean isLoggerUsable() {
        final Logger l = this.getLogger();
        return l != null && !(l instanceof NOPLogger);
    }
    
    public void setContext(final BoxContext bc) {
        this.myBoxContext = bc;
    }
    
    public BoxContext getBoxContext() {
        return this.myBoxContext;
    }
    
    public void clearTriggers() {
        this.myTriggers.clear();
    }
    
    public void attachTrigger(final TrigType trig) {
        this.myTriggers.add(trig);
    }
    
    public List<TrigType> getTriggers() {
        return this.myTriggers;
    }
    
    public String getFieldSummary() {
        return super.getFieldSummary() + ", triggerCount=" + this.myTriggers.size();
    }
    
    static {
        ABoxImpl.theLogger = LoggerFactory.getLogger((Class)ABoxImpl.class);
    }
}

/*

	Total time: 26 ms
	
*/