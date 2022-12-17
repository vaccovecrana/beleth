
package io.k8s.api.core.v1;



/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 * 
 */
public class AzureFilePersistentVolumeSource {

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Boolean readOnly;
    /**
     * secretName is the name of secret that contains Azure Storage Account Name and Key
     * (Required)
     * 
     */
    public String secretName;
    /**
     * secretNamespace is the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
     * 
     */
    public String secretNamespace;
    /**
     * shareName is the azure Share Name
     * (Required)
     * 
     */
    public String shareName;

    public AzureFilePersistentVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public AzureFilePersistentVolumeSource withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    public AzureFilePersistentVolumeSource withSecretNamespace(String secretNamespace) {
        this.secretNamespace = secretNamespace;
        return this;
    }

    public AzureFilePersistentVolumeSource withShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

}
