package io.vacco.beleth;

import io.vacco.beleth.rt.BlKubeCtl;
import io.vacco.beleth.util.BlHeadless;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static io.vacco.beleth.util.BlMaps.*;
import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlKubeCtlTest {

  static {
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true");
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_PRETTYPRINT, "true");
  }

  static {
    var ns = obj(
      kv("apiVersion", "v1"),
      kv("kind", "Namespace"),
      kv("metadata", obj(
        kv("name", "test-ns"),
        kv("annotations", obj(
          kv("foo", "bar")
        ))
      ))
    );
    var k = new BlKubeCtl();

    it("Creates a K8S resource", () -> BlHeadless.runOnDesktop(() -> {
      if (!k.isSynced(ns)) {
        k.apply(ns);
      }
    }));
    it("Checks the status of a K8S resource", () -> BlHeadless.runOnDesktop(() -> {
      System.out.println(k.diff(ns));
    }));
    it("Deletes a K8S resource", () -> BlHeadless.runOnDesktop(() -> {
      if (k.isSynced(ns)) {
        k.pause(2500).delete(ns);
      }
    }));
  }
}
