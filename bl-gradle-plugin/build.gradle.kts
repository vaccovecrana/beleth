configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

dependencies {
  implementation(gradleApi())
  implementation(project(":bl-codegen"))
}

configurations.all {
  // exclude("javax.xml.bind", "jaxb-api")
}