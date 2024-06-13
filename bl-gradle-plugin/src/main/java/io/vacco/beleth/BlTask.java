package io.vacco.beleth;

import io.vacco.beleth.xform.BlCodeGen;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.tasks.*;
import java.io.*;
import java.net.URL;

public abstract class BlTask extends DefaultTask {

  @Input public abstract ListProperty<URL> getCrdUrls();

  public BlTask() {
    var prj = getProject();
    var jxt = prj.getExtensions().getByType(JavaPluginExtension.class);
    var ssMain = jxt.getSourceSets().getByName("main");
    var crdSrc = getCrdSourcesDir();
    var k8sSrc = new File(prj.getRootDir(), "k8s");
    ssMain.getJava().srcDir(k8sSrc);
    getOutputs().dir(crdSrc);
  }

  public void crdSrc(String crdUri) {
    try {
      getCrdUrls().add(new URL(crdUri));
    } catch (Exception e) {
      throw new GradleException("Unable to add CRD source URL", e);
    }
  }

  private File getCrdSourcesDir() {
    var generated = new File(getBuildDir(), "generated");
    return new File(generated, "crd");
  }

  private File getBuildDir() {
    var prj = getProject();
    return prj.getLayout().getBuildDirectory().getAsFile().get();
  }

  @TaskAction public void action() {
    try {
      var cg = new BlCodeGen();
      for (URL u : getCrdUrls().get()) {
        cg.crdXForm(u, getCrdSourcesDir());
      }
    } catch (Exception e) {
      throw new GradleException("Unable to generate java CRD sources.", e);
    }
  }

}
