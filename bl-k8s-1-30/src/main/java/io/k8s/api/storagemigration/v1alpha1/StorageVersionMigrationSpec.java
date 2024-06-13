package io.k8s.api.storagemigration.v1alpha1;

import java.lang.String;

/**
 * Spec of the storage version migration.
 */
public class StorageVersionMigrationSpec {
  public String continueToken;

  public GroupVersionResource resource;

  /**
   * The token used in the list options to get the next chunk of objects to migrate. When the .status.conditions indicates the migration is &#34;Running&#34;, users can use this token to check the progress of the migration.
   */
  public StorageVersionMigrationSpec continueToken(String continueToken) {
    this.continueToken = continueToken;
    return this;
  }

  public StorageVersionMigrationSpec resource(GroupVersionResource resource) {
    this.resource = resource;
    return this;
  }
}
