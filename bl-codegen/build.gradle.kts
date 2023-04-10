configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

val api by configurations

dependencies {
  api(project(":bl-util"))
  api("com.squareup:javapoet:1.13.0")
  api("org.yaml:snakeyaml:2.0")
  api("org.glassfish:jakarta.json:2.0.1")
  api("io.vacco.cpiohell:cpio-hell:0.1.2")
}

tasks.withType<Test> {
  minHeapSize = "512m"
  maxHeapSize = "8192m"
}
