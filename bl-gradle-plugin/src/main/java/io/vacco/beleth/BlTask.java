package io.vacco.beleth;

import io.vacco.beleth.helm.*;
import io.vacco.beleth.xform.BlCodeGen;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.tasks.*;
import java.io.*;
import java.net.URL;

public abstract class BlTask extends DefaultTask {

  @Input public abstract ListProperty<BlHelmChart> getCharts();
  @Input public abstract ListProperty<URL> getCrdUrls();

  private final BlHelmCache helmCache = new BlHelmCache();

  public BlTask() {
    var prj = getProject();
    var jxt = prj.getExtensions().getByType(JavaPluginExtension.class);
    var ssMain = jxt.getSourceSets().getByName("main");
    var helmSrc = getHelmSourcesDir();
    var k8sSrc = new File(prj.getRootDir(), "k8s");
    ssMain.getJava().srcDir(helmSrc).srcDir(k8sSrc);
    getOutputs().dir(helmSrc);
  }

  public void helmChart(String repoAlias, String chart, String version) {
    getCharts().add(helmCache.chartFor(repoAlias, chart, version));
  }

  public void helmChart(String repoAlias, String chart) {
    helmChart(repoAlias, chart, null);
  }

  public void crdSrc(String crdUrl) {
    try {
      getCrdUrls().add(new URL(crdUrl));
    } catch (Exception e) {
      throw new GradleException("Unable to add CRD source URL", e);
    }
  }

  private File getBuildDir() {
    var prj = getProject();
    return prj.getLayout().getBuildDirectory().getAsFile().get();
  }

  private File getHelmSourcesDir() {
    var generated = new File(getBuildDir(), "generated");
    return new File(generated, "helm");
  }

  private File getHelmStagingDir() {
    return new File(getBuildDir(), "helm");
  }

  @TaskAction public void action() {
    try {
      for (var chart : getCharts().get()) {
        BlHelmGen.apply(
          new URL(chart.url), chart.rootPackage(),
          getHelmStagingDir(), getHelmSourcesDir()
        );
      }
      var cg = new BlCodeGen();
      for (URL u : getCrdUrls().get()) {
        cg.crdXForm(u, getHelmSourcesDir());
      }
    } catch (Exception e) {
      throw new GradleException("Unable to generate java CRD sources.", e);
    }
  }

}
