package io.vacco.beleth;

import io.k8s.api.core.v1.*;
import io.vacco.beleth.rt.BlHelmCtl;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlYalmTest {
  static {
    it("Renders YAML objects with enums", () -> {
      var svc = new Service().withSpec(
        new ServiceSpec().withType(ServiceSpec.Type.LOAD_BALANCER)
      );
      var h = new BlHelmCtl();
      System.out.println(h.render(svc));
    });
  }
}
