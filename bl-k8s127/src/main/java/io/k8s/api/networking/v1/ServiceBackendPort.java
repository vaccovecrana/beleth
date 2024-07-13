package io.k8s.api.networking.v1;

import java.lang.Long;
import java.lang.String;

/**
 * ServiceBackendPort is the service port being referenced.
 */
public class ServiceBackendPort {
  public String name;

  public Long number;

  /**
   * name is the name of the port on the Service. This is a mutually exclusive setting with &#34;Number&#34;.
   */
  public ServiceBackendPort name(String name) {
    this.name = name;
    return this;
  }

  /**
   * number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with &#34;Name&#34;.
   */
  public ServiceBackendPort number(Long number) {
    this.number = number;
    return this;
  }

  public static ServiceBackendPort serviceBackendPort() {
    return new ServiceBackendPort();
  }
}
