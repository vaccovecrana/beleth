configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

dependencies {
  implementation(gradleApi())
  implementation(project(":bl-codegen"))
}
