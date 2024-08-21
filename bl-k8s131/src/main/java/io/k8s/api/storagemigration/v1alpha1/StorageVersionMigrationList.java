package io.k8s.api.storagemigration.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * StorageVersionMigrationList is a collection of storage version migrations.
 */
public class StorageVersionMigrationList {
  public String apiVersion;

  public List<StorageVersionMigration> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public StorageVersionMigrationList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Items is the list of StorageVersionMigration
   */
  public StorageVersionMigrationList items(List<StorageVersionMigration> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public StorageVersionMigrationList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public StorageVersionMigrationList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static StorageVersionMigrationList storageVersionMigrationList() {
    return new StorageVersionMigrationList();
  }
}
