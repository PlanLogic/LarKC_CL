

package com.netbreeze.swing;
import java.awt.*;

public class InvalidComponentException extends Exception {
  Component component;

  public InvalidComponentException(Component component, String message) {
    this.component = component;
  }

  public Component getComponent() {
    return component;
  }
}