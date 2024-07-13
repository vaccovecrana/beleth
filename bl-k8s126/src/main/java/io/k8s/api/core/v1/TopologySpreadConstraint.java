package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 */
public class TopologySpreadConstraint {
  public LabelSelector labelSelector;

  public List<String> matchLabelKeys;

  public Long maxSkew;

  public Long minDomains;

  public String nodeAffinityPolicy;

  public String nodeTaintsPolicy;

  public String topologyKey;

  public String whenUnsatisfiable;

  public TopologySpreadConstraint labelSelector(LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

  /**
   * MatchLabelKeys is a set of pod label keys to select the pods over which spreading will be calculated. The keys are used to lookup values from the incoming pod labels, those key-value labels are ANDed with labelSelector to select the group of existing pods over which spreading will be calculated for the incoming pod. Keys that don&#39;t exist in the incoming pod labels will be ignored. A null or empty list means only match against labelSelector.
   */
  public TopologySpreadConstraint matchLabelKeys(List<String> matchLabelKeys) {
    this.matchLabelKeys = matchLabelKeys;
    return this;
  }

  /**
   * MaxSkew describes the degree to which pods may be unevenly distributed. When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. The global minimum is the minimum number of matching pods in an eligible domain or zero if the number of eligible domains is less than MinDomains. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 2/2/1: In this case, the global minimum is 1. | zone1 | zone2 | zone3 | |  P P  |  P P  |   P   | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 2/2/2; scheduling it onto zone1(zone2) would make the ActualSkew(3-1) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence to topologies that satisfy it. It&#39;s a required field. Default value is 1 and 0 is not allowed.
   */
  public TopologySpreadConstraint maxSkew(Long maxSkew) {
    this.maxSkew = maxSkew;
    return this;
  }

  /**
   * MinDomains indicates a minimum number of eligible domains. When the number of eligible domains with matching topology keys is less than minDomains, Pod Topology Spread treats &#34;global minimum&#34; as 0, and then the calculation of Skew is performed. And when the number of eligible domains with matching topology keys equals or greater than minDomains, this value has no effect on scheduling. As a result, when the number of eligible domains is less than minDomains, scheduler won&#39;t schedule more than maxSkew Pods to those domains. If value is nil, the constraint behaves as if MinDomains is equal to 1. Valid values are integers greater than 0. When value is not nil, WhenUnsatisfiable must be DoNotSchedule.
   *
   * For example, in a 3-zone cluster, MaxSkew is set to 2, MinDomains is set to 5 and pods with the same labelSelector spread as 2/2/2: | zone1 | zone2 | zone3 | |  P P  |  P P  |  P P  | The number of domains is less than 5(MinDomains), so &#34;global minimum&#34; is treated as 0. In this situation, new pod with the same labelSelector cannot be scheduled, because computed skew will be 3(3 - 0) if new Pod is scheduled to any of the three zones, it will violate MaxSkew.
   *
   * This is a beta field and requires the MinDomainsInPodTopologySpread feature gate to be enabled (enabled by default).
   */
  public TopologySpreadConstraint minDomains(Long minDomains) {
    this.minDomains = minDomains;
    return this;
  }

  /**
   * NodeAffinityPolicy indicates how we will treat Pod&#39;s nodeAffinity/nodeSelector when calculating pod topology spread skew. Options are: - Honor: only nodes matching nodeAffinity/nodeSelector are included in the calculations. - Ignore: nodeAffinity/nodeSelector are ignored. All nodes are included in the calculations.
   *
   * If this value is nil, the behavior is equivalent to the Honor policy. This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
   */
  public TopologySpreadConstraint nodeAffinityPolicy(String nodeAffinityPolicy) {
    this.nodeAffinityPolicy = nodeAffinityPolicy;
    return this;
  }

  /**
   * NodeTaintsPolicy indicates how we will treat node taints when calculating pod topology spread skew. Options are: - Honor: nodes without taints, along with tainted nodes for which the incoming pod has a toleration, are included. - Ignore: node taints are ignored. All nodes are included.
   *
   * If this value is nil, the behavior is equivalent to the Ignore policy. This is a beta-level feature default enabled by the NodeInclusionPolicyInPodTopologySpread feature flag.
   */
  public TopologySpreadConstraint nodeTaintsPolicy(String nodeTaintsPolicy) {
    this.nodeTaintsPolicy = nodeTaintsPolicy;
    return this;
  }

  /**
   * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &#60;key, value&#62; as a &#34;bucket&#34;, and try to put balanced number of pods into each bucket. We define a domain as a particular instance of a topology. Also, we define an eligible domain as a domain whose nodes meet the requirements of nodeAffinityPolicy and nodeTaintsPolicy. e.g. If TopologyKey is &#34;kubernetes.io/hostname&#34;, each Node is a domain of that topology. And, if TopologyKey is &#34;topology.kubernetes.io/zone&#34;, each zone is a domain of that topology. It&#39;s a required field.
   */
  public TopologySpreadConstraint topologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return this;
  }

  /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,
   *   but giving higher precedence to topologies that would help reduce the
   *   skew.
   * A constraint is considered &#34;Unsatisfiable&#34; for an incoming pod if and only if every possible node assignment for that pod would violate &#34;MaxSkew&#34; on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won&#39;t make it <code>*</code>more<code>*</code> imbalanced. It&#39;s a required field.
   *
   */
  public TopologySpreadConstraint whenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
    return this;
  }

  public static TopologySpreadConstraint topologySpreadConstraint() {
    return new TopologySpreadConstraint();
  }
}
