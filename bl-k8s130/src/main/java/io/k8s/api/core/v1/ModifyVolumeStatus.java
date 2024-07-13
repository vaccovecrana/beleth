package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ModifyVolumeStatus represents the status object of ControllerModifyVolume operation
 */
public class ModifyVolumeStatus {
  public String status;

  public String targetVolumeAttributesClassName;

  /**
   * status is the status of the ControllerModifyVolume operation. It can be in any of following states:
   *  - Pending
   *    Pending indicates that the PersistentVolumeClaim cannot be modified due to unmet requirements, such as
   *    the specified VolumeAttributesClass not existing.
   *  - InProgress
   *    InProgress indicates that the volume is being modified.
   *  - Infeasible
   *   Infeasible indicates that the request has been rejected as invalid by the CSI driver. To
   * 	  resolve the error, a valid VolumeAttributesClass needs to be specified.
   * Note: New statuses can be added in the future. Consumers should check for unknown statuses and fail appropriately.
   */
  public ModifyVolumeStatus status(String status) {
    this.status = status;
    return this;
  }

  /**
   * targetVolumeAttributesClassName is the name of the VolumeAttributesClass the PVC currently being reconciled
   */
  public ModifyVolumeStatus targetVolumeAttributesClassName(
      String targetVolumeAttributesClassName) {
    this.targetVolumeAttributesClassName = targetVolumeAttributesClassName;
    return this;
  }

  public static ModifyVolumeStatus modifyVolumeStatus() {
    return new ModifyVolumeStatus();
  }
}
