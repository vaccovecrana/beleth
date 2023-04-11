package io.k8s.api.core.v1.persistentvolumestatus;

/**
 * phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
 *
 * Possible enum values:
 *  - `&#34;Available&#34;` used for PersistentVolumes that are not yet bound Available volumes are held by the binder and matched to PersistentVolumeClaims
 *  - `&#34;Bound&#34;` used for PersistentVolumes that are bound
 *  - `&#34;Failed&#34;` used for PersistentVolumes that failed to be correctly recycled or deleted after being released from a claim
 *  - `&#34;Pending&#34;` used for PersistentVolumes that are not available
 *  - `&#34;Released&#34;` used for PersistentVolumes where the bound PersistentVolumeClaim was deleted released volumes must be recycled before becoming available again this phase is used by the persistent volume claim binder to signal to another process to reclaim the resource
 */
public enum Phase {
  Available,

  Bound,

  Failed,

  Pending,

  Released
}
