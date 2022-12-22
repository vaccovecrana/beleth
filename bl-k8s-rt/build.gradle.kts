configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

val api by configurations

dependencies {
  api(project(":bl-util"))
  api("org.buildobjects:jproc:2.8.2")
  api("com.google.code.gson:gson:2.10")
  testImplementation(project(":bl-k8s-1-25"))
}
