package io.k8s.api.core.v1;

import io.k8s.api.core.v1.persistentvolumeclaimstatus.AllocatedResources;
import io.k8s.api.core.v1.persistentvolumeclaimstatus.Capacity;
import java.lang.String;
import java.util.List;

/**
 * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
 */
public class PersistentVolumeClaimStatus {
  public List<String> accessModes;

  public AllocatedResources allocatedResources;

  public Capacity capacity;

  public List<PersistentVolumeClaimCondition> conditions;

  public String phase;

  public String resizeStatus;

  /**
   * accessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   */
  public PersistentVolumeClaimStatus accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  /**
   * allocatedResources is the storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
   */
  public PersistentVolumeClaimStatus allocatedResources(AllocatedResources allocatedResources) {
    this.allocatedResources = allocatedResources;
    return this;
  }

  /**
   * capacity represents the actual resources of the underlying volume.
   */
  public PersistentVolumeClaimStatus capacity(Capacity capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to &#39;ResizeStarted&#39;.
   */
  public PersistentVolumeClaimStatus conditions(List<PersistentVolumeClaimCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * phase represents the current phase of PersistentVolumeClaim.
   *
   */
  public PersistentVolumeClaimStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

  /**
   * resizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
   */
  public PersistentVolumeClaimStatus resizeStatus(String resizeStatus) {
    this.resizeStatus = resizeStatus;
    return this;
  }

  public static PersistentVolumeClaimStatus persistentVolumeClaimStatus() {
    return new PersistentVolumeClaimStatus();
  }
}
