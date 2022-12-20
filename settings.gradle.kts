pluginManagement { repositories { mavenCentral(); gradlePluginPortal() } }

include(
  "bl-codegen",
  "bl-k8s-1-25",
  "bl-gradle-plugin"
)

project(":bl-gradle-plugin").name = "io.vacco.beleth.gradle.plugin"
