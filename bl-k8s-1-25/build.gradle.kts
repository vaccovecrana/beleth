configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

version = "1.25.8"

dependencies {
  implementation("com.google.code.gson:gson:2.10.1")
  testImplementation(project(":bl-codegen"))
}
