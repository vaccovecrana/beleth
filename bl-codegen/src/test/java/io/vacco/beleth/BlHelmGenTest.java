package io.vacco.beleth;

import io.vacco.beleth.gen.BlTestLogger;
import io.vacco.beleth.helm.*;
import io.vacco.beleth.util.BlHeadless;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;
import java.util.List;

import static org.junit.Assert.*;
import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlHelmGenTest {
  static {
    it("Retrieves and unpacks Helm descriptor archives.", () -> BlHeadless.runOnDesktop(() -> {
      var charts = new String[] {
        "/metallb-4.1.12.tgz",
        "/kube-prometheus-stack-43.1.1.tgz",
        "/mysql-9.4.5.tgz",
        "/nats-7.5.4.tgz"
      };
      for (int i = 0; i < charts.length; i++) {
        var helmUrl = BlHelmGenTest.class.getResource(charts[i]);
        var targetDir = new File("./build");
        var javaSrc = new BlHelmGen().apply(
          helmUrl, targetDir, new BlTestLogger(),
          "unit-test-repo-" + i
        );
        System.out.println("Sources generated at " + javaSrc.getAbsolutePath());
      }
    }));
    it("Reads Helm resources from cache", () -> BlHeadless.runOnDesktop(() -> {
      var helmCache = new BlHelmCache("./src/test/resources/helm-home");
      var urlLatest = helmCache.urlFor("bitnami", "kibana", null);
      var urlVer = helmCache.urlFor("bitnami", "kibana", "10.1.14");
      assertNotNull(urlLatest);
      assertNotNull(urlVer);
    }));
    it("Generates Helm sources from local repo definitions.", () -> BlHeadless.runOnDesktop(() -> {
      var helmSrc = new BlHelmSrc();
      helmSrc.repoAlias = "bitnami";
      helmSrc.chart = "metallb";
      new BlHelmGen().apply(
        new File("./build/helm-java"),
        new File("./build/helm"),
        new BlHelmCache(),
        List.of(helmSrc),
        new BlTestLogger()
      );
    }));
  }
}
