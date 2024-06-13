package io.k8s.api.storagemigration.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * StorageVersionMigration represents a migration of stored data to the latest storage version.
 */
public class StorageVersionMigration {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public StorageVersionMigrationSpec spec;

  public StorageVersionMigrationStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public StorageVersionMigration apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public StorageVersionMigration kind(String kind) {
    this.kind = kind;
    return this;
  }

  public StorageVersionMigration metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public StorageVersionMigration spec(StorageVersionMigrationSpec spec) {
    this.spec = spec;
    return this;
  }

  public StorageVersionMigration status(StorageVersionMigrationStatus status) {
    this.status = status;
    return this;
  }
}
