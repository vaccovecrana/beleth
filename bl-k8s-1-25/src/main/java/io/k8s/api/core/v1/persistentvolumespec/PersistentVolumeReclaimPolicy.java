package io.k8s.api.core.v1.persistentvolumespec;

/**
 * persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
 *
 * Possible enum values:
 *  - `&#34;Delete&#34;` means the volume will be deleted from Kubernetes on release from its claim. The volume plugin must support Deletion.
 *  - `&#34;Recycle&#34;` means the volume will be recycled back into the pool of unbound persistent volumes on release from its claim. The volume plugin must support Recycling.
 *  - `&#34;Retain&#34;` means the volume will be left in its current phase (Released) for manual reclamation by the administrator. The default policy is Retain.
 */
public enum PersistentVolumeReclaimPolicy {
  Delete,

  Recycle,

  Retain
}
