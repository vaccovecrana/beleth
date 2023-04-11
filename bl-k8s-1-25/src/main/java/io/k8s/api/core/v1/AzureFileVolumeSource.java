package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 */
public class AzureFileVolumeSource {
  public Boolean readOnly;

  public String secretName;

  public String shareName;

  /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public AzureFileVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * secretName is the  name of secret that contains Azure Storage Account Name and Key
   */
  public AzureFileVolumeSource secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

  /**
   * shareName is the azure share Name
   */
  public AzureFileVolumeSource shareName(String shareName) {
    this.shareName = shareName;
    return this;
  }
}
