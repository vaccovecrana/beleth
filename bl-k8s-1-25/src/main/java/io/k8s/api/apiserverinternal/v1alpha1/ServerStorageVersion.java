package io.k8s.api.apiserverinternal.v1alpha1;

import java.lang.String;
import java.util.List;

/**
 * An API server instance reports the version it can decode and the version it encodes objects to when persisting objects in the backend.
 */
public class ServerStorageVersion {
  public String apiServerID;

  public List<String> decodableVersions;

  public String encodingVersion;

  /**
   * The ID of the reporting API server.
   */
  public ServerStorageVersion apiServerID(String apiServerID) {
    this.apiServerID = apiServerID;
    return this;
  }

  /**
   * The API server can decode objects encoded in these versions. The encodingVersion must be included in the decodableVersions.
   */
  public ServerStorageVersion decodableVersions(List<String> decodableVersions) {
    this.decodableVersions = decodableVersions;
    return this;
  }

  /**
   * The API server encodes the object to this version when persisting it in the backend (e.g., etcd).
   */
  public ServerStorageVersion encodingVersion(String encodingVersion) {
    this.encodingVersion = encodingVersion;
    return this;
  }
}
