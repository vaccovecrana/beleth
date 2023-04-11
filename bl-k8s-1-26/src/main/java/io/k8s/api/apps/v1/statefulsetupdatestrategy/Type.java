package io.k8s.api.apps.v1.statefulsetupdatestrategy;

/**
 * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
 *
 * Possible enum values:
 *  - `&#34;OnDelete&#34;` triggers the legacy behavior. Version tracking and ordered rolling restarts are disabled. Pods are recreated from the StatefulSetSpec when they are manually deleted. When a scale operation is performed with this strategy,specification version indicated by the StatefulSet&#39;s currentRevision.
 *  - `&#34;RollingUpdate&#34;` indicates that update will be applied to all Pods in the StatefulSet with respect to the StatefulSet ordering constraints. When a scale operation is performed with this strategy, new Pods will be created from the specification version indicated by the StatefulSet&#39;s updateRevision.
 */
public enum Type {
  OnDelete,

  RollingUpdate
}
