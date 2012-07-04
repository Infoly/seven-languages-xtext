package org.xtext.template.tests.compiler;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

public class SimpleIfElseStatement {
  private boolean param1;
  
  public SimpleIfElseStatement() {
  }
  
  public SimpleIfElseStatement(final SimpleIfElseStatement other) {
    this.param1 = other.param1;
  }
  
  private boolean cond0() {
    return this.param1;
  }
  
  public String generate() {
    StringBuilder out = new StringBuilder();
    out.append("\nhello ");
    if(cond0()) {
      out.append("World");
    } else {
      out.append("Germany");
    }
    out.append("!");
    return out.toString();
  }
  
  public String generate(final Procedure1<SimpleIfElseStatement> init) {
    try {
      SimpleIfElseStatement tpl = getClass().getConstructor(getClass()).newInstance(this);
      init.apply(tpl);
      return tpl.generate();
    } catch(Exception e) {
      throw Exceptions.sneakyThrow(e);
    }
  }
  
  public void setParam1(final boolean param1) {
    this.param1 = param1;
  }
  
  public String toString() {
    return new ToStringHelper().toString(this);
  }
}