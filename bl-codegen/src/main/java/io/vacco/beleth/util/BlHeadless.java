package io.vacco.beleth.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;

public class BlHeadless {

  private static final Logger log = LoggerFactory.getLogger(BlHeadless.class);

  public static void runLocal(Runnable block) {
    if (!GraphicsEnvironment.isHeadless()) {
      try {
        block.run();
      } catch (Exception e) {
        throw new IllegalStateException(e);
      }
    } else {
      log.info("Headless mode, not doing anything.");
    }
  }

}
