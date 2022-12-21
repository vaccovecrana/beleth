package io.vacco.beleth;

import io.vacco.beleth.gen.BlTestLogger;
import io.vacco.beleth.helm.*;
import io.vacco.beleth.util.BlHeadless;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;
import java.util.List;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlHelmGenTest {
  static {
    it("Retrieves and unpacks Helm descriptor archives.", () -> BlHeadless.runOnDesktop(() -> {
      var helmUrl = BlHelmGenTest.class.getResource("/metallb-4.1.12.tgz");
      var targetDir = new File("./build");
      var javaSrc = new BlHelmGen().apply(helmUrl, targetDir, new BlTestLogger(), "unit-test-repo");
      System.out.println("Sources generated at " + javaSrc.getAbsolutePath());
    }));
    it("Reads Helm resources from cache", () -> BlHeadless.runOnDesktop(() -> {
      var helmCache = new BlHelmCache();
      var urlLatest = helmCache.urlFor("bitnami", "kibana", null);
      var urlVer = helmCache.urlFor("bitnami", "kibana", "10.1.14");
    }));
    it("Generates Helm sources from local repo definitions.", () -> {
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
    });
  }
}
