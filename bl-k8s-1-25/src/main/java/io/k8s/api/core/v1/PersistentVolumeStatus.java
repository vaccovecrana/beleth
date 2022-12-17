
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * PersistentVolumeStatus is the current status of a persistent volume.
 * 
 */
public class PersistentVolumeStatus {

    /**
     * message is a human-readable message indicating details about why the volume is in this state.
     * 
     */
    public String message;
    /**
     * phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
     * 
     * Possible enum values:
     *  - `"Available"` used for PersistentVolumes that are not yet bound Available volumes are held by the binder and matched to PersistentVolumeClaims
     *  - `"Bound"` used for PersistentVolumes that are bound
     *  - `"Failed"` used for PersistentVolumes that failed to be correctly recycled or deleted after being released from a claim
     *  - `"Pending"` used for PersistentVolumes that are not available
     *  - `"Released"` used for PersistentVolumes where the bound PersistentVolumeClaim was deleted released volumes must be recycled before becoming available again this phase is used by the persistent volume claim binder to signal to another process to reclaim the resource
     * 
     */
    public PersistentVolumeStatus.Phase phase;
    /**
     * reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
     * 
     */
    public String reason;

    public PersistentVolumeStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    public PersistentVolumeStatus withPhase(PersistentVolumeStatus.Phase phase) {
        this.phase = phase;
        return this;
    }

    public PersistentVolumeStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }


    /**
     * phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
     * 
     * Possible enum values:
     *  - `"Available"` used for PersistentVolumes that are not yet bound Available volumes are held by the binder and matched to PersistentVolumeClaims
     *  - `"Bound"` used for PersistentVolumes that are bound
     *  - `"Failed"` used for PersistentVolumes that failed to be correctly recycled or deleted after being released from a claim
     *  - `"Pending"` used for PersistentVolumes that are not available
     *  - `"Released"` used for PersistentVolumes where the bound PersistentVolumeClaim was deleted released volumes must be recycled before becoming available again this phase is used by the persistent volume claim binder to signal to another process to reclaim the resource
     * 
     */
    public enum Phase {

        AVAILABLE("Available"),
        BOUND("Bound"),
        FAILED("Failed"),
        PENDING("Pending"),
        RELEASED("Released");
        private final String value;
        private final static Map<String, PersistentVolumeStatus.Phase> CONSTANTS = new HashMap<String, PersistentVolumeStatus.Phase>();

        static {
            for (PersistentVolumeStatus.Phase c: values()) {
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

        public static PersistentVolumeStatus.Phase fromValue(String value) {
            PersistentVolumeStatus.Phase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
