package io.k8s.api.flowcontrol.v1beta3;

import java.lang.String;

/**
 * ServiceAccountSubject holds detailed information for service-account-kind subject.
 */
public class ServiceAccountSubject {
  public String name;

  public String namespace;

  /**
   * `name` is the name of matching ServiceAccount objects, or &#34;<code>*</code>&#34; to match regardless of name. Required.
   */
  public ServiceAccountSubject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * `namespace` is the namespace of matching ServiceAccount objects. Required.
   */
  public ServiceAccountSubject namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  public static ServiceAccountSubject serviceAccountSubject() {
    return new ServiceAccountSubject();
  }
}
