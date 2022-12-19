package io.vacco.ronove;

import org.gradle.api.Project;
import org.gradle.api.file.RegularFileProperty;

public class BlPluginExtension {

  public RegularFileProperty outFile;
  public String[] controllerClasses = new String[]{};

  public BlPluginExtension(Project p) {
    this.outFile = p.getObjects().fileProperty();
  }
}
