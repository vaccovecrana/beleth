pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
  }
}

include(
  "bl-codegen",
  "bl-k8s131",
  "bl-k8s130",
  "bl-k8s129",
  "bl-k8s-rt",
  "bl-k8s-test",
  "bl-gradle-plugin",
)

project(":bl-gradle-plugin").name = "io.vacco.beleth.gradle.plugin"
