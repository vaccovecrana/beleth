package io.k8s.api.core.v1.podstatus;

/**
 * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
 *
 * Possible enum values:
 *  - `&#34;BestEffort&#34;` is the BestEffort qos class.
 *  - `&#34;Burstable&#34;` is the Burstable qos class.
 *  - `&#34;Guaranteed&#34;` is the Guaranteed qos class.
 */
public enum QosClass {
  BestEffort,

  Burstable,

  Guaranteed
}
