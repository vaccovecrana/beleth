configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

dependencies {
  implementation(gradleApi())
  implementation("io.marioslab.basis:template:1.7")
  implementation("io.vacco.oruzka:oruzka:0.1.4")
}

configurations.all {
  // exclude("javax.xml.bind", "jaxb-api")
}