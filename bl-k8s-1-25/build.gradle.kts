configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

version = "1.25.3"

dependencies {
  testImplementation(project(":bl-codegen"))
}

tasks.withType<Test> {
  minHeapSize = "512m"
  maxHeapSize = "16384m"
}
