configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

val api by configurations

dependencies {
  api(project(":bl-util"))
  api("io.marioslab.basis:template:1.7")
  api("com.esotericsoftware.yamlbeans:yamlbeans:1.15")
  api("com.google.code.gson:gson:2.10.1")
  api("io.vacco.cpiohell:cpio-hell:0.1.2")
}

tasks.withType<Test> {
  minHeapSize = "512m"
  maxHeapSize = "8192m"
}