configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

dependencies {
  implementation(project(":bl-codegen"))
  implementation(project(":bl-k8s-1-25"))
}
