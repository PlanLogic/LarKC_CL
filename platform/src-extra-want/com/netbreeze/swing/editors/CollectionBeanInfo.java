package com.netbreeze.swing.editors;

import java.beans.*;
import java.util.*;

public class CollectionBeanInfo extends SimpleBeanInfo {
  public BeanDescriptor getBeanDescriptor() {
    return new BeanDescriptor(Collection.class, CollectionCustomizer.class);
  }
}