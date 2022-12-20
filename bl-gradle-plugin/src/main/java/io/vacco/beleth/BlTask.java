package io.vacco.beleth;

import io.vacco.beleth.helm.BlHelmGen;
import org.gradle.api.DefaultTask;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.*;
import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;

public abstract class BlTask extends DefaultTask {

  @Input public abstract Property<URI[]> getHelmPackages();

  public BlTask() {
    var prj = getProject();
    var jxt = prj.getExtensions().getByType(JavaPluginExtension.class);
    var ssMain = jxt.getSourceSets().getByName("main");
    var helmSrc = getTargetHelmSourcesDir();
    ssMain.getJava().srcDir(helmSrc);
    getOutputs().dir(helmSrc);
  }

  private void delete(File dir) throws IOException {
    if (dir.exists()) {
      var fs = Files.walk(dir.toPath());
      try (fs) {
        fs.sorted(Comparator.reverseOrder())
          .map(Path::toFile)
          .forEach(File::delete);
      }
    }
  }

  private File getBuildDir() {
    var prj = getProject();
    return prj.getLayout().getBuildDirectory().getAsFile().get();
  }

  private File getTargetHelmSourcesDir() {
    var generated = new File(getBuildDir(), "generated");
    return new File(generated, "helm");
  }

  private File getTargetBuildDir() {
    return new File(getBuildDir(), "helm");
  }

  @TaskAction public void action() throws IOException {
    var helmSrc = getTargetHelmSourcesDir();
    delete(helmSrc);
    helmSrc.mkdirs();
    for (URI u : getHelmPackages().get()) {
      var javaSrc = new BlHelmGen().apply(u.toURL(), getTargetBuildDir(), new BlLogger());
      for (File f : Objects.requireNonNull(javaSrc.listFiles())) {
        if (f.isDirectory()) {
          var tgt = new File(helmSrc, f.getName());
          Files.move(f.toPath(), tgt.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
      }
    }
  }
}
