package io.k8s.api.core.v1.topologyspreadconstraint;

/**
 * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,
 *   but giving higher precedence to topologies that would help reduce the
 *   skew.
 * A constraint is considered &#34;Unsatisfiable&#34; for an incoming pod if and only if every possible node assignment for that pod would violate &#34;MaxSkew&#34; on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won&#39;t make it <code>*</code>more<code>*</code> imbalanced. It&#39;s a required field.
 *
 * Possible enum values:
 *  - `&#34;DoNotSchedule&#34;` instructs the scheduler not to schedule the pod when constraints are not satisfied.
 *  - `&#34;ScheduleAnyway&#34;` instructs the scheduler to schedule the pod even if constraints are not satisfied.
 */
public enum WhenUnsatisfiable {
  DoNotSchedule,

  ScheduleAnyway
}
