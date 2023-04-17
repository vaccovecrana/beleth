configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

version = "1.27.0"

dependencies {
  compileOnly(project(":bl-codegen"))
  testImplementation(project(":bl-codegen"))
}
