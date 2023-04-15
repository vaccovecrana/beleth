import io.vacco.beleth.helm.BlHelmGen;
import io.vacco.beleth.util.*;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;
import java.net.URL;

import static io.vacco.beleth.util.BlMaps.*;
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

      var chartIdx = obj(
        kv("https://charts.bitnami.com/bitnami/clickhouse-3.1.6.tgz", "com.bitnami.clickhouse"),
        kv("https://charts.bitnami.com/bitnami/apache-9.2.2.tgz", "com.bitnami.apache"),
        kv("https://argoproj.github.io/argo-helm/argo-1.0.0.tgz", "com.github.argo"),
        kv("https://scylla-operator-charts.storage.googleapis.com/stable/scylla-v1.8.0.tgz", "com.scylladb"),
        kv("https://charts.cockroachdb.com/cockroachdb-10.0.6.tgz", "com.cockroachdb"),
        kv("https://github.com/metallb/metallb/releases/download/metallb-chart-0.13.9/metallb-0.13.9.tgz", "metallb.io"),
        kv("https://github.com/jenkinsci/helm-charts/releases/download/jenkins-4.3.20/jenkins-4.3.20.tgz", "com.github.jenkinsci"),
        kv("https://github.com/fluxcd-community/helm-charts/releases/download/flux2-2.6.0/flux2-2.6.0.tgz", "com.github.fluxcd"),
        kv("https://github.com/prometheus-community/helm-charts/releases/download/kube-prometheus-stack-45.10.0/kube-prometheus-stack-45.10.0.tgz", "com.github.prometheus"),
        kv("https://github.com/kubernetes/ingress-nginx/releases/download/helm-chart-4.5.2/ingress-nginx-4.5.2.tgz", "com.github.kubernetes.nginx"),
        kv("https://charts.jetstack.io/charts/cert-manager-v1.8.2.tgz", "io.jetstack.certmanager")
      );
      for (var e : chartIdx.entrySet()) {
        BlHelmGen.apply(new URL(e.getKey()), e.getValue(), buildDir, helmJavaSrc);
      }
    }));
  }
}
