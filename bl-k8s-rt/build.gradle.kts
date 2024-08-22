val api by configurations
val k8s129 = ":bl-k8s129"

dependencies {
  api("org.buildobjects:jproc:2.8.2")
  api(project(":bl-codegen"))
  compileOnly(project(k8s129))
  testImplementation(project(k8s129))
}

// LELZ test?