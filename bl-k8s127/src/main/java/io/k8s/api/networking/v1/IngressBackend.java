package io.k8s.api.networking.v1;

import io.k8s.api.core.v1.TypedLocalObjectReference;

/**
 * IngressBackend describes all endpoints for a given service and port.
 */
public class IngressBackend {
  public TypedLocalObjectReference resource;

  public IngressServiceBackend service;

  public IngressBackend resource(TypedLocalObjectReference resource) {
    this.resource = resource;
    return this;
  }

  public IngressBackend service(IngressServiceBackend service) {
    this.service = service;
    return this;
  }

  public static IngressBackend ingressBackend() {
    return new IngressBackend();
  }
}
