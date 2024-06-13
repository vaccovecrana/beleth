package io.k8s.api.apiserverinternal.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * Storage version of a specific resource.
 */
public class StorageVersion {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public StorageVersionSpec spec;

  public StorageVersionStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public StorageVersion apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public StorageVersion kind(String kind) {
    this.kind = kind;
    return this;
  }

  public StorageVersion metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public StorageVersion spec(StorageVersionSpec spec) {
    this.spec = spec;
    return this;
  }

  public StorageVersion status(StorageVersionStatus status) {
    this.status = status;
    return this;
  }

  public static StorageVersion storageVersion() {
    return new StorageVersion();
  }
}
