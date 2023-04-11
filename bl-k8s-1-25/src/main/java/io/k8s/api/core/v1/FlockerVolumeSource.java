package io.k8s.api.core.v1;

import java.lang.String;

/**
 * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
 */
public class FlockerVolumeSource {
  public String datasetName;

  public String datasetUUID;

  /**
   * datasetName is Name of the dataset stored as metadata -&#62; name on the dataset for Flocker should be considered as deprecated
   */
  public FlockerVolumeSource datasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  /**
   * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
   */
  public FlockerVolumeSource datasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
    return this;
  }
}
