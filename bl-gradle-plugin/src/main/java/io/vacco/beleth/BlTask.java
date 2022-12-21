package io.vacco.beleth;

import io.vacco.beleth.helm.*;
import org.gradle.api.DefaultTask;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.tasks.*;
import java.io.*;

public abstract class BlTask extends DefaultTask {

  @Input
  public abstract ListProperty<BlHelmSrc> getSources();
  private final BlHelmCache helmCache = new BlHelmCache();

  public BlTask() {
    var prj = getProject();
    var jxt = prj.getExtensions().getByType(JavaPluginExtension.class);
    var ssMain = jxt.getSourceSets().getByName("main");
    var helmSrc = getHelmSourcesDir();
    ssMain.getJava().srcDir(helmSrc);
    getOutputs().dir(helmSrc);
  }

  public void helmSrc(String repoAlias, String chart, String version) {
    var hs = new BlHelmSrc();
    hs.repoAlias = repoAlias;
    hs.chart = chart;
    hs.version = version;
    getSources().add(hs);
  }

  public void helmSrc(String repoAlias, String chart) {
    helmSrc(repoAlias, chart, null);
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

  @TaskAction public void action() throws IOException {
    new BlHelmGen().apply(
      getHelmSourcesDir(), getHelmStagingDir(),
      helmCache, getSources().get(), new BlLogger()
    );
  }
}
