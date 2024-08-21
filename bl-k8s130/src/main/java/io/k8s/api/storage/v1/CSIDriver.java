package io.k8s.api.storage.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * CSIDriver captures information about a Container Storage Interface (CSI) volume driver deployed on the cluster. Kubernetes attach detach controller uses this object to determine whether attach is required. Kubelet uses this object to determine whether pod information needs to be passed on mount. CSIDriver objects are non-namespaced.
 */
public class CSIDriver {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public CSIDriverSpec spec;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public CSIDriver apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public CSIDriver kind(String kind) {
    this.kind = kind;
    return this;
  }

  public CSIDriver metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public CSIDriver spec(CSIDriverSpec spec) {
    this.spec = spec;
    return this;
  }

  public static CSIDriver cSIDriver() {
    return new CSIDriver();
  }
}
