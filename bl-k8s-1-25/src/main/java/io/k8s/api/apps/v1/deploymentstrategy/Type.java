package io.k8s.api.apps.v1.deploymentstrategy;

/**
 * Type of deployment. Can be &#34;Recreate&#34; or &#34;RollingUpdate&#34;. Default is RollingUpdate.
 *
 * Possible enum values:
 *  - `&#34;Recreate&#34;` Kill all existing pods before creating new ones.
 *  - `&#34;RollingUpdate&#34;` Replace the old ReplicaSets by new one using rolling update i.e gradually scale down the old ReplicaSets and scale up the new one.
 */
public enum Type {
  Recreate,

  RollingUpdate
}
