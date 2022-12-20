package io.vacco.beleth;

import org.gradle.api.logging.*;
import org.jsonschema2pojo.RuleLogger;

public class BlLogger implements RuleLogger {

  private static final Logger log = Logging.getLogger(BlLogger.class);

  @Override public void debug(String msg) { log.debug(msg); }
  @Override public void error(String msg) { log.error(msg); }
  @Override public void error(String s, Throwable e) { log.error(s, e); }
  @Override public void info(String msg) { log.info(msg); }
  @Override public boolean isDebugEnabled() { return log.isDebugEnabled(); }
  @Override public boolean isErrorEnabled() { return log.isErrorEnabled(); }
  @Override public boolean isInfoEnabled() { return log.isInfoEnabled(); }
  @Override public boolean isTraceEnabled() { return log.isTraceEnabled(); }
  @Override public boolean isWarnEnabled() { return log.isWarnEnabled(); }
  @Override public void trace(String msg) { log.trace(msg); }
  @Override public void warn(String s, Throwable e) { log.warn(s, e); }
  @Override public void warn(String msg) { log.warn(msg); }

}
