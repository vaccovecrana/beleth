package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 */
public class AzureFilePersistentVolumeSource {
  public Boolean readOnly;

  public String secretName;

  public String secretNamespace;

  public String shareName;

  /**
   * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   */
  public AzureFilePersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * secretName is the name of secret that contains Azure Storage Account Name and Key
   */
  public AzureFilePersistentVolumeSource secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

  /**
   * secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
   */
  public AzureFilePersistentVolumeSource secretNamespace(String secretNamespace) {
    this.secretNamespace = secretNamespace;
    return this;
  }

  /**
   * shareName is the azure Share Name
   */
  public AzureFilePersistentVolumeSource shareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  public static AzureFilePersistentVolumeSource azureFilePersistentVolumeSource() {
    return new AzureFilePersistentVolumeSource();
  }
}
