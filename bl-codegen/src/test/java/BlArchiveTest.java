import io.vacco.beleth.helm.*;
import io.vacco.beleth.util.*;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;
import java.net.URL;
import java.util.List;

import static j8spec.J8Spec.*;
import static org.junit.Assert.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlArchiveTest {

  static {
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true");
  }

  public static File tarGzDir, build = new File("./build");

  static {
    it("Downloads and expands an archive file", () -> {
      var url = new URL("https://charts.bitnami.com/bitnami/airflow-14.0.16.tgz");
      tarGzDir = BlArchive.unpackTarGz(url, build);
    });
    it("Walks a file tree", () -> {
      BlArchive.scan(tarGzDir, ".json", ".yaml", ".yml")
        .forEach(f -> {
          System.out.println(f.getAbsolutePath());
        });
    });
    it("Loads chart definitons from the Helm cache", () -> {
      var helmCache = new BlHelmCache("./src/test/resources/helm");
      var urlLatest = helmCache.chartFor("metallb", "metallb", null);
      var urlVer = helmCache.chartFor("metallb", "metallb", "0.13.3");
      assertNotNull(urlLatest);
      assertNotNull(urlVer);
    });
    it("Generates schemas from a Helm Chart archive", () -> BlHeadless.runOnDesktop(() -> {
      var buildDir = new File("./build");
      var helmJavaSrc = new File(buildDir, "helm-java-src");
      var cache = new BlHelmCache();

      helmJavaSrc.mkdirs();

      /*
        helm repo add bitnami https://charts.bitnami.com/bitnami
        helm repo add jenkins https://charts.jenkins.io
        helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx
        helm repo add cockroachdb https://charts.cockroachdb.com/
        helm repo add scylla https://scylla-operator-charts.storage.googleapis.com/stable
        helm repo update
       */

      var charts = List.of(
        cache.chartFor("bitnami", "clickhouse"),
        cache.chartFor("bitnami", "apache"),
        cache.chartFor("bitnami", "metallb", "4.1.13"),
        cache.chartFor("bitnami", "kube-prometheus"),
        cache.chartFor("bitnami", "flux"),
        cache.chartFor("bitnami", "argo-cd"),
        cache.chartFor("bitnami", "cert-manager"),
        cache.chartFor("bitnami", "nats"),
        cache.chartFor("scylla", "scylla"),
        cache.chartFor("cockroachdb", "cockroachdb"),
        cache.chartFor("jenkins", "jenkins"),
        cache.chartFor("ingress-nginx", "ingress-nginx")
      );

      for (var c : charts) {
        BlHelmGen.apply(c.url, c.rootPackage(), buildDir, helmJavaSrc);
      }
    }));
  }
}
