package io.k8s.api.networking.v1beta1;

import java.lang.String;

/**
 * ParentReference describes a reference to a parent object.
 */
public class ParentReference {
  public String group;

  public String name;

  public String namespace;

  public String resource;

  /**
   * Group is the group of the object being referenced.
   */
  public ParentReference group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Name is the name of the object being referenced.
   */
  public ParentReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace is the namespace of the object being referenced.
   */
  public ParentReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Resource is the resource of the object being referenced.
   */
  public ParentReference resource(String resource) {
    this.resource = resource;
    return this;
  }

  public static ParentReference parentReference() {
    return new ParentReference();
  }
}
