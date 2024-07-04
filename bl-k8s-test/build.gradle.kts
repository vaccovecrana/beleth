import io.vacco.oss.gitflow.GsPluginProfileExtension

the<GsPluginProfileExtension>().addJ8Spec()

dependencies {
  implementation(project(":bl-codegen"))
  implementation(project(":bl-k8s-rt"))
  implementation(project(":bl-k8s-1-25"))
  implementation("io.vacco.shax:shax:2.0.6.0.1.0")
}

tasks.withType<JacocoReport> {
  sourceSets(
      project(":bl-codegen").sourceSets.main.get(),
      project(":bl-k8s-rt").sourceSets.main.get(),
  )
}
