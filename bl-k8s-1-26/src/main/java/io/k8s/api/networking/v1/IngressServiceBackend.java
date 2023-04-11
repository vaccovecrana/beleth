package io.k8s.api.networking.v1;

import java.lang.String;

/**
 * IngressServiceBackend references a Kubernetes Service as a Backend.
 */
public class IngressServiceBackend {
  public String name;

  public ServiceBackendPort port;

  /**
   * Name is the referenced service. The service must exist in the same namespace as the Ingress object.
   */
  public IngressServiceBackend name(String name) {
    this.name = name;
    return this;
  }

  public IngressServiceBackend port(ServiceBackendPort port) {
    this.port = port;
    return this;
  }
}
