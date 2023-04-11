package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.String;
import java.util.List;

/**
 * NetworkPolicySpec provides the specification of a NetworkPolicy
 */
public class NetworkPolicySpec {
  public List<NetworkPolicyEgressRule> egress;

  public List<NetworkPolicyIngressRule> ingress;

  public LabelSelector podSelector;

  public List<String> policyTypes;

  /**
   * egress is a list of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
   */
  public NetworkPolicySpec egress(List<NetworkPolicyEgressRule> egress) {
    this.egress = egress;
    return this;
  }

  /**
   * ingress is a list of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod&#39;s local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)
   */
  public NetworkPolicySpec ingress(List<NetworkPolicyIngressRule> ingress) {
    this.ingress = ingress;
    return this;
  }

  public NetworkPolicySpec podSelector(LabelSelector podSelector) {
    this.podSelector = podSelector;
    return this;
  }

  /**
   * policyTypes is a list of rule types that the NetworkPolicy relates to. Valid options are [&#34;Ingress&#34;], [&#34;Egress&#34;], or [&#34;Ingress&#34;, &#34;Egress&#34;]. If this field is not specified, it will default based on the existence of ingress or egress rules; policies that contain an egress section are assumed to affect egress, and all policies (whether or not they contain an ingress section) are assumed to affect ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ &#34;Egress&#34; ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include &#34;Egress&#34; (since such a policy would not include an egress section and would otherwise default to just [ &#34;Ingress&#34; ]). This field is beta-level in 1.8
   */
  public NetworkPolicySpec policyTypes(List<String> policyTypes) {
    this.policyTypes = policyTypes;
    return this;
  }
}
