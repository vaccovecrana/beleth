package io.vacco.beleth;

import org.gradle.api.*;

public class BlPlugin implements Plugin<Project> {

  @Override public void apply(Project project) {
    project.afterEvaluate(p -> {
      var tasks = project.getTasks();
      var classes = tasks.getByName("classes");
      var blTask = tasks.create("crd-codegen", BlTask.class);
      blTask.setGroup("build");
      blTask.setDescription("Generates java sources for CRDs.");
      classes.dependsOn(blTask);
    });
  }

}
