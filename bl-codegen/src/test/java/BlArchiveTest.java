import io.vacco.beleth.helm.BlHelmGen;
import io.vacco.beleth.util.*;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;
import java.net.URL;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlArchiveTest {

  static { ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true"); }

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
    it("Generates schemas from a Helm Chart archive", () -> BlHeadless.runOnDesktop(() -> {
      var buildDir = new File("./build");
      var helmJavaSrc = new File(buildDir, "helm-java-src");

      helmJavaSrc.mkdirs();

      var packages = new String[] {
        "https://charts.cockroachdb.com/cockroachdb-10.0.6.tgz",
        "https://github.com/metallb/metallb/releases/download/metallb-chart-0.13.9/metallb-0.13.9.tgz",
        "https://github.com/jenkinsci/helm-charts/releases/download/jenkins-4.3.20/jenkins-4.3.20.tgz",
        "https://github.com/fluxcd-community/helm-charts/releases/download/flux2-2.6.0/flux2-2.6.0.tgz",
        "https://github.com/prometheus-community/helm-charts/releases/download/kube-prometheus-stack-45.10.0/kube-prometheus-stack-45.10.0.tgz",
        "https://github.com/kubernetes/ingress-nginx/releases/download/helm-chart-4.5.2/ingress-nginx-4.5.2.tgz",
        "https://charts.jetstack.io/charts/cert-manager-v1.8.2.tgz"
      };

      for (var pkg : packages) {
        BlHelmGen.apply(new URL(pkg), "io.vacco.test", buildDir, helmJavaSrc);
      }
    }));
  }
}
