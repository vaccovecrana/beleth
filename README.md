# beleth

Programmatic resource management for Kubernetes.

Schema objects are generated for the latest three [Patch Releases](https://kubernetes.io/releases/patch-releases/). 

`kubectl` and `helm` executables must be available in `PATH` in order to interact with a live K8S cluster.

## Development Notes

To generate typed bean resources for new K8S versions, use `kubectl` to access Swagger definitions inside a running
MiniKube cluster:

```
$ kubectl proxy --port=8080
$ curl localhost:8080/openapi/v2 > tmp.json
$ jq ".definitions" tmp.json > k8s-swagger.json 
```

For CI/CD servers, a base Docker image or Runtime environment must have the following tools installed:

- Gradle 7+
- Helm
- Kubectl

As expected, a valid Kube `config` file for the tools above is also expected, since this framework relies on these
tools for access into the cluster.
