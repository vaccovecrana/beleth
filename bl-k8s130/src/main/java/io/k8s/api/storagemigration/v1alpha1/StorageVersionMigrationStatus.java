package io.k8s.api.storagemigration.v1alpha1;

import java.lang.String;
import java.util.List;

/**
 * Status of the storage version migration.
 */
public class StorageVersionMigrationStatus {
  public List<MigrationCondition> conditions;

  public String resourceVersion;

  /**
   * The latest available observations of the migration&#39;s current state.
   */
  public StorageVersionMigrationStatus conditions(List<MigrationCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * ResourceVersion to compare with the GC cache for performing the migration. This is the current resource version of given group, version and resource when kube-controller-manager first observes this StorageVersionMigration resource.
   */
  public StorageVersionMigrationStatus resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  public static StorageVersionMigrationStatus storageVersionMigrationStatus() {
    return new StorageVersionMigrationStatus();
  }
}
