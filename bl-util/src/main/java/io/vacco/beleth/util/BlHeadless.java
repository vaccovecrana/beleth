package io.vacco.beleth.util;

import java.awt.*;

public class BlHeadless {

  public interface BlUnsafe {
    void run() throws Exception;
  }

  public static void runOnDesktop(BlUnsafe block) {
    if (!GraphicsEnvironment.isHeadless()) {
      try {
        block.run();
      } catch (Exception e) {
        throw new IllegalStateException(e);
      }
    } else {
      System.out.println("CI mode, not doing anything.");
    }
  }

}
