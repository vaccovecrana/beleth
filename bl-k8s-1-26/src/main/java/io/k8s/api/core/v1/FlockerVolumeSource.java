
package io.k8s.api.core.v1;



/**
 * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
 * 
 */
public class FlockerVolumeSource {

    /**
     * datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated
     * 
     */
    public String datasetName;
    /**
     * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
     * 
     */
    public String datasetUUID;

    public FlockerVolumeSource withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    public FlockerVolumeSource withDatasetUUID(String datasetUUID) {
        this.datasetUUID = datasetUUID;
        return this;
    }

}
