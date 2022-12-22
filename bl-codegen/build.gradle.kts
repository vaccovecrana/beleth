configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

val api by configurations

dependencies {
  api(project(":bl-util"))
  api("org.jsonschema2pojo:jsonschema2pojo-core:1.1.2")
  api("io.vacco.cpiohell:cpio-hell:0.1.2")
}

configurations.all {
  exclude("joda-time", "joda-time")
  exclude("com.google.code.findbugs", "annotations")
  exclude("com.google.code.findbugs", "jsr305")
  exclude("com.google.code.gson", "gson")
}

tasks.withType<Test> {
  minHeapSize = "512m"
  maxHeapSize = "8192m"
}