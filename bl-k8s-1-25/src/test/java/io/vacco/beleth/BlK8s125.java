package io.vacco.beleth;

import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.awt.*;
import java.io.File;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlK8s125 {
  static {
    it("Generates classes for K8S 1.25",  () -> {
      if (GraphicsEnvironment.isHeadless()) {
        System.out.println("CI mode, not doing anything.");
      } else {
        BlK8sGen.apply(
          BlK8s125.class.getResource("/k8s-swagger.json"),
          new File("./src/main/java")
        );
      }
    });
  }
}
