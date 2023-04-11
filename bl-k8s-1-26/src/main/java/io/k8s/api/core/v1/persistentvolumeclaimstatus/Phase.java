package io.k8s.api.core.v1.persistentvolumeclaimstatus;

/**
 * phase represents the current phase of PersistentVolumeClaim.
 *
 * Possible enum values:
 *  - `&#34;Bound&#34;` used for PersistentVolumeClaims that are bound
 *  - `&#34;Lost&#34;` used for PersistentVolumeClaims that lost their underlying PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any longer and all data on it was lost.
 *  - `&#34;Pending&#34;` used for PersistentVolumeClaims that are not yet bound
 */
public enum Phase {
  Bound,

  Lost,

  Pending
}
