pluginManagement { repositories { mavenCentral(); gradlePluginPortal() } }

include(
  "bl-util",
  "bl-codegen",
  "bl-k8s-1-25",
  "bl-gradle-plugin",
  "bl-k8s-rt"
)

project(":bl-gradle-plugin").name = "io.vacco.beleth.gradle.plugin"
