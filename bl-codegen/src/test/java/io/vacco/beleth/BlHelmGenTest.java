package io.vacco.beleth;

import io.vacco.beleth.gen.BlTestLogger;
import io.vacco.beleth.helm.BlHelmGen;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.awt.*;
import java.io.File;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlHelmGenTest {
  static {
    it("Retrieves and unpacks Helm descriptor archives.", () -> {
      if (GraphicsEnvironment.isHeadless()) {
        System.out.println("CI mode, not doing anything.");
      } else {
        var helmUrl = BlHelmGenTest.class.getResource("/metallb-4.1.12.tgz");
        var targetDir = new File("./build");
        var javaSrc = new BlHelmGen().apply(helmUrl, targetDir, new BlTestLogger());
        System.out.println("Sources generated at " + javaSrc.getAbsolutePath());
      }
    });
  }
}
