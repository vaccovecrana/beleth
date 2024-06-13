package io.k8s.api.storage.v1alpha1;

import io.k8s.api.storage.v1alpha1.volumeattributesclass.Parameters;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * VolumeAttributesClass represents a specification of mutable volume attributes defined by the CSI driver. The class can be specified during dynamic provisioning of PersistentVolumeClaims, and changed in the PersistentVolumeClaim spec after provisioning.
 */
public class VolumeAttributesClass {
  public String apiVersion;

  public String driverName;

  public String kind;

  public ObjectMeta metadata;

  public Parameters parameters;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public VolumeAttributesClass apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Name of the CSI driver This field is immutable.
   */
  public VolumeAttributesClass driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public VolumeAttributesClass kind(String kind) {
    this.kind = kind;
    return this;
  }

  public VolumeAttributesClass metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * parameters hold volume attributes defined by the CSI driver. These values are opaque to the Kubernetes and are passed directly to the CSI driver. The underlying storage provider supports changing these attributes on an existing volume, however the parameters field itself is immutable. To invoke a volume update, a new VolumeAttributesClass should be created with new parameters, and the PersistentVolumeClaim should be updated to reference the new VolumeAttributesClass.
   *
   * This field is required and must contain at least one key/value pair. The keys cannot be empty, and the maximum number of parameters is 512, with a cumulative max size of 256K. If the CSI driver rejects invalid parameters, the target PersistentVolumeClaim will be set to an &#34;Infeasible&#34; state in the modifyVolumeStatus field.
   */
  public VolumeAttributesClass parameters(Parameters parameters) {
    this.parameters = parameters;
    return this;
  }
}
