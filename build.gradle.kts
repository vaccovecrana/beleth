plugins { id("io.vacco.oss.gitflow") version "0.9.8" apply(false) }

subprojects {
  apply(plugin = "io.vacco.oss.gitflow")
  group = "io.vacco.beleth"
  version = "0.2.0"

  configure<io.vacco.oss.gitflow.GsPluginProfileExtension> {
    addJ8Spec()
    addClasspathHell()
  }

  dependencies {
    val testImplementation by configurations
    testImplementation("io.vacco.shax:shax:2.0.6.0.1.0")
  }

  configure<io.vacco.cphell.ChPluginExtension> {
    resourceExclusions.add("module-info.class")
  }

  tasks.withType<Javadoc> {
    isFailOnError = false
  }
}
