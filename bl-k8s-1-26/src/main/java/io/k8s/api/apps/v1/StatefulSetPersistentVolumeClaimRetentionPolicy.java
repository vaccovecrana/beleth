
package io.k8s.api.apps.v1;



/**
 * StatefulSetPersistentVolumeClaimRetentionPolicy describes the policy used for PVCs created from the StatefulSet VolumeClaimTemplates.
 * 
 */
public class StatefulSetPersistentVolumeClaimRetentionPolicy {

    /**
     * WhenDeleted specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is deleted. The default policy of `Retain` causes PVCs to not be affected by StatefulSet deletion. The `Delete` policy causes those PVCs to be deleted.
     * 
     */
    public String whenDeleted;
    /**
     * WhenScaled specifies what happens to PVCs created from StatefulSet VolumeClaimTemplates when the StatefulSet is scaled down. The default policy of `Retain` causes PVCs to not be affected by a scaledown. The `Delete` policy causes the associated PVCs for any excess pods above the replica count to be deleted.
     * 
     */
    public String whenScaled;

    public StatefulSetPersistentVolumeClaimRetentionPolicy withWhenDeleted(String whenDeleted) {
        this.whenDeleted = whenDeleted;
        return this;
    }

    public StatefulSetPersistentVolumeClaimRetentionPolicy withWhenScaled(String whenScaled) {
        this.whenScaled = whenScaled;
        return this;
    }

}
