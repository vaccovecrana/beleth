configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

val api by configurations

dependencies {
  api(project(":bl-util"))
  api("org.buildobjects:jproc:2.8.2")
  api("org.yaml:snakeyaml:1.33")
  api("org.slf4j:slf4j-api:2.0.6")

  compileOnly(project(":bl-k8s-1-25"))
  testImplementation("io.vacco.shax:shax:2.0.6.0.1.0")
}
