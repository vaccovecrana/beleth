package io.k8s.api.storage.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * CSINode holds information about all CSI drivers installed on a node. CSI drivers do not need to create the CSINode object directly. As long as they use the node-driver-registrar sidecar container, the kubelet will automatically populate the CSINode object for the CSI driver as part of kubelet plugin registration. CSINode has the same name as a node. If the object is missing, it means either there are no CSI Drivers available on the node, or the Kubelet version is low enough that it doesn&#39;t create this object. CSINode has an OwnerReference that points to the corresponding node object.
 */
public class CSINode {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public CSINodeSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public CSINode apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public CSINode kind(String kind) {
    this.kind = kind;
    return this;
  }

  public CSINode metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public CSINode spec(CSINodeSpec spec) {
    this.spec = spec;
    return this;
  }

  public static CSINode cSINode() {
    return new CSINode();
  }
}
