package io.k8s.api.resource.v1alpha2;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * ResourceSlice provides information about available resources on individual nodes.
 */
public class ResourceSlice {
  public String apiVersion;

  public String driverName;

  public String kind;

  public ObjectMeta metadata;

  public NamedResourcesResources namedResources;

  public String nodeName;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ResourceSlice apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * DriverName identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
   */
  public ResourceSlice driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ResourceSlice kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ResourceSlice metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ResourceSlice namedResources(NamedResourcesResources namedResources) {
    this.namedResources = namedResources;
    return this;
  }

  /**
   * NodeName identifies the node which provides the resources if they are local to a node.
   *
   * A field selector can be used to list only ResourceSlice objects with a certain node name.
   */
  public ResourceSlice nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }
}
