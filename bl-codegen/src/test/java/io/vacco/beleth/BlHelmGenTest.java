package io.vacco.beleth;

import io.vacco.beleth.gen.BlGenConfig;
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
        var helmGen = new BlHelmGen();
        var natsUrl = BlHelmGenTest.class.getResource("/kube-prometheus-stack-40.5.0.tgz");
        var targetDir = new File("./build");
        var helmRoot = helmGen.unpack(natsUrl, targetDir);
        var schemasRoot = helmGen.scan(helmRoot);
        var javaSources = helmGen.generate(schemasRoot, new BlGenConfig(), new BlTestLogger());
      }
    });
  }
}
