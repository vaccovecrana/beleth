package io.vacco.beleth.gen;

import org.jsonschema2pojo.AbstractRuleLogger;

public class BlTestLogger extends AbstractRuleLogger {
  @Override public boolean isDebugEnabled() { return true; }
  @Override public boolean isErrorEnabled() { return true; }
  @Override public boolean isInfoEnabled() { return true; }
  @Override public boolean isTraceEnabled() { return true; }
  @Override public boolean isWarnEnabled() { return true; }

  @Override protected void doDebug(String msg) { System.out.println(msg); }
  @Override protected void doError(String msg, Throwable e) {
    System.out.println(msg);
    if (e != null) {
      e.printStackTrace();
    }
  }
  @Override protected void doInfo(String msg) { System.out.println(msg); }
  @Override protected void doTrace(String msg) { System.out.println(msg); }
  @Override protected void doWarn(String msg, Throwable e) {
    System.out.println(msg);
    if (e != null) {
      e.printStackTrace();
    }
  }
}
