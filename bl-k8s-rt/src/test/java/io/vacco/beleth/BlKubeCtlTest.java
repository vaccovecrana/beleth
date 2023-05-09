package io.vacco.beleth;

import io.k8s.api.core.v1.Namespace;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import io.vacco.beleth.rt.BlKubeCtl;
import io.vacco.beleth.util.BlHeadless;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static io.vacco.beleth.rt.BlCmd.*;
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

    var nsObj = new Namespace()
      .apiVersion("v1")
      .kind("Namespace")
      .metadata(new ObjectMeta().name("gopher-infra"));

    var k = new BlKubeCtl();

    it("Lists all K8S resources", () -> {
      k.listAllResources();
    });

    it("Creates a K8S resource", () -> BlHeadless.runOnDesktop(() -> {
      // var resources = k.getApiResources();
      if (!k.isSynced(nsObj)) {
        k.apply(nsObj);
      }
      if (!k.isSynced(ns)) {
        k.apply(ns);
      }
    }));
    it("Checks the status of a K8S resource", () -> BlHeadless.runOnDesktop(() -> {
      System.out.println(k.diff(ns));
    }));
    it("Deletes a K8S resource", () -> BlHeadless.runOnDesktop(() -> {
      if (k.isSynced(ns)) {
        pause(2500);
        k.delete(ns);
      }
    }));
  }
}
