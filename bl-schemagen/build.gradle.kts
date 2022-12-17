configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

val api by configurations

dependencies {
  api("org.jsonschema2pojo:jsonschema2pojo-core:1.1.2")
}

tasks.withType<Test> {
  minHeapSize = "512m"
  maxHeapSize = "8192m"
}