val api by configurations
val k8s125 = ":bl-k8s125"

dependencies {
  api("org.buildobjects:jproc:2.8.2")
  api(project(":bl-codegen"))
  compileOnly(project(k8s125))
  testImplementation(project(k8s125))
}
