import io.vacco.beleth.Helm.BlHelmGen;
import io.vacco.beleth.util.BlArchive;
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
    it("Generates schemas from a Helm Chart archive", () -> {
      var buildDir = new File("./build");
      var helmJavaSrc = new File(buildDir, "helm-java-src");

      // https://github.com/jenkinsci/helm-charts/releases/download/jenkins-4.3.20/jenkins-4.3.20.tgz
      // https://github.com/fluxcd-community/helm-charts/releases/download/flux2-2.6.0/flux2-2.6.0.tgz
      // https://github.com/prometheus-community/helm-charts/releases/download/kube-prometheus-stack-45.10.0/kube-prometheus-stack-45.10.0.tgz

      helmJavaSrc.mkdirs();
      BlHelmGen.apply(
        new URL("https://github.com/kubernetes/ingress-nginx/releases/download/helm-chart-4.5.2/ingress-nginx-4.5.2.tgz"),
        "io.jenkins", buildDir, helmJavaSrc
      );
      System.out.println("lol");
    });
  }
}
