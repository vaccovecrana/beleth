package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;

import java.lang.Long;
import java.lang.String;

/**
 * ServiceReference holds a reference to Service.legacy.k8s.io
 */
public class ServiceReference {
  public String name;

  public String namespace;

  public Long port;

  /**
   * Name is the name of the service
   */
  public ServiceReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace is the namespace of the service
   */
  public ServiceReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
   */
  public ServiceReference port(Long port) {
    this.port = port;
    return this;
  }
}
