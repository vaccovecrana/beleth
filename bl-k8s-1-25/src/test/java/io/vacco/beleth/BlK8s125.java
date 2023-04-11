package io.vacco.beleth;

import io.vacco.beleth.util.BlHeadless;
import io.vacco.beleth.xform.BlCodeGen;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlK8s125 {
  static {
    it("Generates classes for K8S 1.25", () -> BlHeadless.runOnDesktop(() -> {
      var cg = new BlCodeGen();
      cg.swaggerXForm(
        BlK8s125.class.getResource("/k8s-swagger.json"),
        new File("./src/main/java")
      );
    }));
  }
}
