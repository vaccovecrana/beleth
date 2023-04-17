configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

version = "1.26.3"

dependencies {
  compileOnly(project(":bl-codegen"))
  testImplementation(project(":bl-codegen"))
}
