configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

val api by configurations

dependencies {
  api(project(":bl-util"))
  api("org.buildobjects:jproc:2.8.2")
  api("com.google.code.gson:gson:2.10")
  api("org.yaml:snakeyaml:1.33")
  api("org.slf4j:slf4j-api:2.0.6")

  implementation(project(":bl-k8s-1-25"))
  testImplementation("io.vacco.shax:shax:2.0.6.0.1.0")
}

tasks.withType<Test> {
  minHeapSize = "512m"
  maxHeapSize = "8192m"
}
