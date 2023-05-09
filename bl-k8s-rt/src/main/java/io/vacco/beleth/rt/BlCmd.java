package io.vacco.beleth.rt;

import org.buildobjects.process.*;
import org.slf4j.*;

public class BlCmd {

  private static final Logger log = LoggerFactory.getLogger(BlCmd.class);

  public static ProcResult runCmd(ProcBuilder p) {
    p.withNoTimeout();
    log.info("Running [{}]", p.getCommandLine());
    var res = p.run();
    log.info("[{}] {} {}", res.getExitValue(), res.getOutputString(), res.getErrorString());
    return res;
  }

  public static void pause(long ms) {
    try {
      Thread.sleep(ms);
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

}
