package io.k8s.api.admissionregistration.v1;

import java.lang.Long;
import java.lang.String;

/**
 * ServiceReference holds a reference to Service.legacy.k8s.io
 */
public class ServiceReference {
  public String name;

  public String namespace;

  public String path;

  public Long port;

  /**
   * `name` is the name of the service. Required
   */
  public ServiceReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * `namespace` is the namespace of the service. Required
   */
  public ServiceReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * `path` is an optional URL path which will be sent in any request to this service.
   */
  public ServiceReference path(String path) {
    this.path = path;
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
