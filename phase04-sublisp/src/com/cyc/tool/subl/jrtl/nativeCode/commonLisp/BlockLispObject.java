package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;


public class BlockLispObject extends AbstractLispObject {
  
  public String writeToString() {
  	return unreadableString(getClass().getSimpleName());
  }
}
