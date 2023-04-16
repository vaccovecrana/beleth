configure<io.vacco.oss.gitflow.GsPluginProfileExtension> { sharedLibrary(true, false) }

val api by configurations

dependencies {
  api("com.squareup:javapoet:1.13.0")
  api("org.yaml:snakeyaml:2.0")
  api("com.google.code.gson:gson:2.10.1")
  api("org.glassfish:jakarta.json:2.0.1")
  api("io.vacco.cpiohell:cpio-hell:0.1.2")
  api("org.slf4j:slf4j-api:2.0.6")
}
