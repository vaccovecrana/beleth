
package io.k8s.api.core.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 * 
 */
public class PersistentVolumeClaimSpec {

    /**
     * accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    public List<String> accessModes;
    /**
     * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
     * 
     */
    public TypedLocalObjectReference dataSource;
    /**
     * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
     * 
     */
    public TypedLocalObjectReference dataSourceRef;
    /**
     * ResourceRequirements describes the compute resource requirements.
     * 
     */
    public ResourceRequirements resources;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    public LabelSelector selector;
    /**
     * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     * 
     */
    public String storageClassName;
    /**
     * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
     * 
     */
    public String volumeMode;
    /**
     * volumeName is the binding reference to the PersistentVolume backing this claim.
     * 
     */
    public String volumeName;

    public PersistentVolumeClaimSpec withAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeClaimSpec withDataSource(TypedLocalObjectReference dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public PersistentVolumeClaimSpec withDataSourceRef(TypedLocalObjectReference dataSourceRef) {
        this.dataSourceRef = dataSourceRef;
        return this;
    }

    public PersistentVolumeClaimSpec withResources(ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    public PersistentVolumeClaimSpec withSelector(LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public PersistentVolumeClaimSpec withStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    public PersistentVolumeClaimSpec withVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
        return this;
    }

    public PersistentVolumeClaimSpec withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

}
