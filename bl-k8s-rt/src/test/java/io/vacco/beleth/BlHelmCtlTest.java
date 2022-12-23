package io.vacco.beleth;

import io.vacco.beleth.rt.BlHelmCtl;
import io.vacco.beleth.util.BlHeadless;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static io.vacco.beleth.util.BlMaps.*;
import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlHelmCtlTest {

  static {
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true");
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_PRETTYPRINT, "true");
  }

  private static final BlHelmCtl k = new BlHelmCtl();

  static {
    var release = "kube-prometheus-stack";
    var values = obj(
      kv("grafana", obj(kv("enabled", true))),
      kv("prometheus", obj(
        kv("prometheusSpec", obj(
          kv("storageSpec", obj(
            kv("emptyDir", obj(
              kv("medium", "Memory")
            ))
          ))
        ))
      ))
    );

    it("Uninstalls a Helm package, if present", () -> BlHeadless.runOnDesktop(() -> {
      if (k.isDeployed(release, null, null)) {
        k.uninstall(release, null, true);
      }
    }));
    it("Installs a Helm package", () -> BlHeadless.runOnDesktop(() -> {
      k.pause(10000).install(
        "kube-prometheus-stack",
        "prometheus-community/kube-prometheus-stack",
        null, null, values
      );
    }));
    it("Retrieves a Helm package status", () -> BlHeadless.runOnDesktop(() -> {
      System.out.println(k.render(k.status(release, null)));
    }));
    it("Uninstalls a Helm package", () -> BlHeadless.runOnDesktop(() -> {
      if (k.isDeployed(release, null, null)) {
        k.uninstall(release, null, false);
      }
    }));
  }
}
