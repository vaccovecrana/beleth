package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.String;
import java.util.List;

/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 */
public class PersistentVolumeClaimSpec {
  public List<String> accessModes;

  public TypedLocalObjectReference dataSource;

  public TypedObjectReference dataSourceRef;

  public ResourceRequirements resources;

  public LabelSelector selector;

  public String storageClassName;

  public String volumeMode;

  public String volumeName;

  /**
   * accessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   */
  public PersistentVolumeClaimSpec accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public PersistentVolumeClaimSpec dataSource(TypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  public PersistentVolumeClaimSpec dataSourceRef(TypedObjectReference dataSourceRef) {
    this.dataSourceRef = dataSourceRef;
    return this;
  }

  public PersistentVolumeClaimSpec resources(ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  public PersistentVolumeClaimSpec selector(LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * storageClassName is the name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   */
  public PersistentVolumeClaimSpec storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

  /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
   */
  public PersistentVolumeClaimSpec volumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return this;
  }

  /**
   * volumeName is the binding reference to the PersistentVolume backing this claim.
   */
  public PersistentVolumeClaimSpec volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }
}
