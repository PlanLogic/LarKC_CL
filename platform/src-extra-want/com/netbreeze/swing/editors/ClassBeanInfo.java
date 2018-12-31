package com.netbreeze.swing.editors;

import java.beans.*;

/**
 * A BeanInfo for java.lang.Class. This one provides a Customizer
 * GUI class which the same as LargeBeanView, but adds tabs
 * for static methods and constructors as well.
*/
public class ClassBeanInfo extends SimpleBeanInfo {
  public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(Class.class, ClassCustomizer.class);
  }
}