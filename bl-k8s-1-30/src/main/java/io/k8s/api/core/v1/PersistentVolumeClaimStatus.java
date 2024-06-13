package io.k8s.api.core.v1;

import io.k8s.api.core.v1.persistentvolumeclaimstatus.AllocatedResourceStatuses;
import io.k8s.api.core.v1.persistentvolumeclaimstatus.AllocatedResources;
import io.k8s.api.core.v1.persistentvolumeclaimstatus.Capacity;
import java.lang.String;
import java.util.List;

/**
 * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
 */
public class PersistentVolumeClaimStatus {
  public List<String> accessModes;

  public AllocatedResourceStatuses allocatedResourceStatuses;

  public AllocatedResources allocatedResources;

  public Capacity capacity;

  public List<PersistentVolumeClaimCondition> conditions;

  public String currentVolumeAttributesClassName;

  public ModifyVolumeStatus modifyVolumeStatus;

  public String phase;

  /**
   * accessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   */
  public PersistentVolumeClaimStatus accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  /**
   * allocatedResourceStatuses stores status of resource being resized for the given PVC. Key names follow standard Kubernetes label syntax. Valid values are either:
   * 	<code>*</code> Un-prefixed keys:
   * 		- storage - the capacity of the volume.
   * 	<code>*</code> Custom resources must use implementation-defined prefixed names such as &#34;example.com/my-custom-resource&#34;
   * Apart from above values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.
   *
   * ClaimResourceStatus can be in any of following states:
   * 	- ControllerResizeInProgress:
   * 		State set when resize controller starts resizing the volume in control-plane.
   * 	- ControllerResizeFailed:
   * 		State set when resize has failed in resize controller with a terminal error.
   * 	- NodeResizePending:
   * 		State set when resize controller has finished resizing the volume but further resizing of
   * 		volume is needed on the node.
   * 	- NodeResizeInProgress:
   * 		State set when kubelet starts resizing the volume.
   * 	- NodeResizeFailed:
   * 		State set when resizing has failed in kubelet with a terminal error. Transient errors don&#39;t set
   * 		NodeResizeFailed.
   * For example: if expanding a PVC for more capacity - this field can be one of the following states:
   * 	- pvc.status.allocatedResourceStatus[&#39;storage&#39;] = &#34;ControllerResizeInProgress&#34;
   *      - pvc.status.allocatedResourceStatus[&#39;storage&#39;] = &#34;ControllerResizeFailed&#34;
   *      - pvc.status.allocatedResourceStatus[&#39;storage&#39;] = &#34;NodeResizePending&#34;
   *      - pvc.status.allocatedResourceStatus[&#39;storage&#39;] = &#34;NodeResizeInProgress&#34;
   *      - pvc.status.allocatedResourceStatus[&#39;storage&#39;] = &#34;NodeResizeFailed&#34;
   * When this field is not set, it means that no resize operation is in progress for the given PVC.
   *
   * A controller that receives PVC update with previously unknown resourceName or ClaimResourceStatus should ignore the update for the purpose it was designed. For example - a controller that only is responsible for resizing capacity of the volume, should ignore PVC updates that change other valid resources associated with PVC.
   *
   * This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
   */
  public PersistentVolumeClaimStatus allocatedResourceStatuses(
      AllocatedResourceStatuses allocatedResourceStatuses) {
    this.allocatedResourceStatuses = allocatedResourceStatuses;
    return this;
  }

  /**
   * allocatedResources tracks the resources allocated to a PVC including its capacity. Key names follow standard Kubernetes label syntax. Valid values are either:
   * 	<code>*</code> Un-prefixed keys:
   * 		- storage - the capacity of the volume.
   * 	<code>*</code> Custom resources must use implementation-defined prefixed names such as &#34;example.com/my-custom-resource&#34;
   * Apart from above values - keys that are unprefixed or have kubernetes.io prefix are considered reserved and hence may not be used.
   *
   * Capacity reported here may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity.
   *
   * A controller that receives PVC update with previously unknown resourceName should ignore the update for the purpose it was designed. For example - a controller that only is responsible for resizing capacity of the volume, should ignore PVC updates that change other valid resources associated with PVC.
   *
   * This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
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
   * conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to &#39;Resizing&#39;.
   */
  public PersistentVolumeClaimStatus conditions(List<PersistentVolumeClaimCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * currentVolumeAttributesClassName is the current name of the VolumeAttributesClass the PVC is using. When unset, there is no VolumeAttributeClass applied to this PersistentVolumeClaim This is an alpha field and requires enabling VolumeAttributesClass feature.
   */
  public PersistentVolumeClaimStatus currentVolumeAttributesClassName(
      String currentVolumeAttributesClassName) {
    this.currentVolumeAttributesClassName = currentVolumeAttributesClassName;
    return this;
  }

  public PersistentVolumeClaimStatus modifyVolumeStatus(ModifyVolumeStatus modifyVolumeStatus) {
    this.modifyVolumeStatus = modifyVolumeStatus;
    return this;
  }

  /**
   * phase represents the current phase of PersistentVolumeClaim.
   */
  public PersistentVolumeClaimStatus phase(String phase) {
    this.phase = phase;
    return this;
  }
}
