package io.vacco.beleth;

import org.gradle.api.*;

public class BlPlugin implements Plugin<Project> {

  @Override public void apply(Project project) {
    var classes = project.getTasks().getByName("classes");
    var blTask = project.getTasks().create("helm", BlTask.class);
    blTask.setGroup("build");
    blTask.setDescription("Generates java sources for Helm packages.");
    classes.dependsOn(blTask);
  }

}
