
package io.k8s.api.core.v1;



/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 * 
 */
public class AzureFileVolumeSource {

    /**
     * readOnly defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Boolean readOnly;
    /**
     * secretName is the  name of secret that contains Azure Storage Account Name and Key
     * (Required)
     * 
     */
    public String secretName;
    /**
     * shareName is the azure share Name
     * (Required)
     * 
     */
    public String shareName;

    public AzureFileVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public AzureFileVolumeSource withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    public AzureFileVolumeSource withShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

}
