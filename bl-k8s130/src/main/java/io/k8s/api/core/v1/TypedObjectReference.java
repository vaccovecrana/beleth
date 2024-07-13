package io.k8s.api.core.v1;

import java.lang.String;

public class TypedObjectReference {
  public String apiGroup;

  public String kind;

  public String name;

  public String namespace;

  /**
   * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
   */
  public TypedObjectReference apiGroup(String apiGroup) {
    this.apiGroup = apiGroup;
    return this;
  }

  /**
   * Kind is the type of resource being referenced
   */
  public TypedObjectReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name is the name of resource being referenced
   */
  public TypedObjectReference name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Namespace is the namespace of resource being referenced Note that when a namespace is specified, a gateway.networking.k8s.io/ReferenceGrant object is required in the referent namespace to allow that namespace&#39;s owner to accept the reference. See the ReferenceGrant documentation for details. (Alpha) This field requires the CrossNamespaceVolumeDataSource feature gate to be enabled.
   */
  public TypedObjectReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  public static TypedObjectReference typedObjectReference() {
    return new TypedObjectReference();
  }
}
