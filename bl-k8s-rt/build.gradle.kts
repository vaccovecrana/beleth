configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

val api by configurations

dependencies {
  api(project(":bl-util"))
  api("org.buildobjects:jproc:2.8.2")
  api("org.yaml:snakeyaml:1.27")
  api("org.slf4j:slf4j-api:2.0.6")

  val k8s125 = ":bl-k8s-1-25"
  compileOnly(project(k8s125))
  testImplementation(project(k8s125))
  testImplementation("io.vacco.shax:shax:2.0.6.0.1.0")
}
