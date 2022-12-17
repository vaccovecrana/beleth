
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * PersistentVolumeClaimStatus is the current status of a persistent volume claim.
 * 
 */
public class PersistentVolumeClaimStatus {

    /**
     * accessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    public List<String> accessModes;
    /**
     * allocatedResources is the storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
     * 
     */
    public AllocatedResources allocatedResources;
    /**
     * capacity represents the actual resources of the underlying volume.
     * 
     */
    public Capacity capacity;
    /**
     * conditions is the current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
     * 
     */
    public List<PersistentVolumeClaimCondition> conditions;
    /**
     * phase represents the current phase of PersistentVolumeClaim.
     * 
     * Possible enum values:
     *  - `"Bound"` used for PersistentVolumeClaims that are bound
     *  - `"Lost"` used for PersistentVolumeClaims that lost their underlying PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any longer and all data on it was lost.
     *  - `"Pending"` used for PersistentVolumeClaims that are not yet bound
     * 
     */
    public PersistentVolumeClaimStatus.Phase phase;
    /**
     * resizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
     * 
     */
    public String resizeStatus;

    public PersistentVolumeClaimStatus withAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeClaimStatus withAllocatedResources(AllocatedResources allocatedResources) {
        this.allocatedResources = allocatedResources;
        return this;
    }

    public PersistentVolumeClaimStatus withCapacity(Capacity capacity) {
        this.capacity = capacity;
        return this;
    }

    public PersistentVolumeClaimStatus withConditions(List<PersistentVolumeClaimCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public PersistentVolumeClaimStatus withPhase(PersistentVolumeClaimStatus.Phase phase) {
        this.phase = phase;
        return this;
    }

    public PersistentVolumeClaimStatus withResizeStatus(String resizeStatus) {
        this.resizeStatus = resizeStatus;
        return this;
    }


    /**
     * phase represents the current phase of PersistentVolumeClaim.
     * 
     * Possible enum values:
     *  - `"Bound"` used for PersistentVolumeClaims that are bound
     *  - `"Lost"` used for PersistentVolumeClaims that lost their underlying PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any longer and all data on it was lost.
     *  - `"Pending"` used for PersistentVolumeClaims that are not yet bound
     * 
     */
    public enum Phase {

        BOUND("Bound"),
        LOST("Lost"),
        PENDING("Pending");
        private final String value;
        private final static Map<String, PersistentVolumeClaimStatus.Phase> CONSTANTS = new HashMap<String, PersistentVolumeClaimStatus.Phase>();

        static {
            for (PersistentVolumeClaimStatus.Phase c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Phase(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static PersistentVolumeClaimStatus.Phase fromValue(String value) {
            PersistentVolumeClaimStatus.Phase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
