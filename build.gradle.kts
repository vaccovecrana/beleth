plugins { id("io.vacco.oss.gitflow") version "1.0.1" apply(false) }

subprojects {
  apply(plugin = "io.vacco.oss.gitflow")
  group = "io.vacco.beleth"
  version = "0.4.2"

  configure<io.vacco.oss.gitflow.GsPluginProfileExtension> {
    sharedLibrary(true, false)
    addClasspathHell()
  }

  configure<io.vacco.cphell.ChPluginExtension> {
    resourceExclusions.add("module-info.class")
  }

  tasks.withType<Javadoc> {
    isFailOnError = false
  }
}
