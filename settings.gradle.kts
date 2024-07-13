pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}

include(
  "bl-codegen",
  "bl-k8s125",
  "bl-k8s126",
  "bl-k8s127",
  "bl-k8s130",
  "bl-k8s-rt",
  "bl-k8s-test",
  "bl-gradle-plugin",
)

project(":bl-gradle-plugin").name = "io.vacco.beleth.gradle.plugin"
