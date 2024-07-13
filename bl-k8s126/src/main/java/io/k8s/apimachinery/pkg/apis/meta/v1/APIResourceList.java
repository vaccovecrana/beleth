package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.lang.String;
import java.util.List;

/**
 * APIResourceList is a list of APIResource, it is used to expose the name of the resources supported in a specific group and version, and if the resource is namespaced.
 */
public class APIResourceList {
  public String apiVersion;

  public String groupVersion;

  public String kind;

  public List<APIResource> resources;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public APIResourceList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * groupVersion is the group and version this APIResourceList is for.
   */
  public APIResourceList groupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public APIResourceList kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * resources contains the name of the resources and if they are namespaced.
   */
  public APIResourceList resources(List<APIResource> resources) {
    this.resources = resources;
    return this;
  }

  public static APIResourceList aPIResourceList() {
    return new APIResourceList();
  }
}
