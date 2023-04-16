pluginManagement { repositories { mavenCentral(); gradlePluginPortal() } }

include(
  "bl-codegen",
  "bl-k8s-1-25",
  "bl-k8s-1-26",
  "bl-k8s-1-27",
  "bl-k8s-rt"
  // "bl-gradle-plugin",
)

// project(":bl-gradle-plugin").name = "io.vacco.beleth.gradle.plugin"
