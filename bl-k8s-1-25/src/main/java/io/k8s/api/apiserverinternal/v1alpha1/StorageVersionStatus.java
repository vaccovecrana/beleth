package io.k8s.api.apiserverinternal.v1alpha1;

import java.lang.String;
import java.util.List;

/**
 * API server instances report the versions they can decode and the version they encode objects to when persisting objects in the backend.
 */
public class StorageVersionStatus {
  public String commonEncodingVersion;

  public List<StorageVersionCondition> conditions;

  public List<ServerStorageVersion> storageVersions;

  /**
   * If all API server instances agree on the same encoding storage version, then this field is set to that version. Otherwise this field is left empty. API servers should finish updating its storageVersionStatus entry before serving write operations, so that this field will be in sync with the reality.
   */
  public StorageVersionStatus commonEncodingVersion(String commonEncodingVersion) {
    this.commonEncodingVersion = commonEncodingVersion;
    return this;
  }

  /**
   * The latest available observations of the storageVersion&#39;s state.
   */
  public StorageVersionStatus conditions(List<StorageVersionCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * The reported versions per API server instance.
   */
  public StorageVersionStatus storageVersions(List<ServerStorageVersion> storageVersions) {
    this.storageVersions = storageVersions;
    return this;
  }
}
