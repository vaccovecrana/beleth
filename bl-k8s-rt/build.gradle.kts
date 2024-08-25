val api by configurations
val k8s129 = ":bl-k8s129"

dependencies {
  api(project(":bl-codegen"))
  compileOnly(project(k8s129))
  testImplementation(project(k8s129))
}
