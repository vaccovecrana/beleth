configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

version = "1.26.3"

dependencies {
  implementation("com.google.code.gson:gson:2.10.1")
  testImplementation(project(":bl-codegen"))
}
