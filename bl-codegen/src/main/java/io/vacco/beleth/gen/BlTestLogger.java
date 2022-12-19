package io.vacco.beleth.gen;

import org.jsonschema2pojo.AbstractRuleLogger;

public class BlTestLogger extends AbstractRuleLogger {
  @Override public boolean isDebugEnabled() { return false; }
  @Override public boolean isErrorEnabled() { return false; }
  @Override public boolean isInfoEnabled() { return true; }
  @Override public boolean isTraceEnabled() { return false; }
  @Override public boolean isWarnEnabled() { return false; }

  @Override protected void doDebug(String msg) { System.out.println(msg); }
  @Override protected void doError(String msg, Throwable e) {
    System.out.println(msg);
    e.printStackTrace();
  }
  @Override protected void doInfo(String msg) { System.out.println(msg); }
  @Override protected void doTrace(String msg) { System.out.println(msg); }
  @Override protected void doWarn(String msg, Throwable e) {
    System.out.println(msg);
    e.printStackTrace();
  }
}
