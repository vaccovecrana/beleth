
package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * NetworkPolicyPeer describes a peer to allow traffic to/from. Only certain combinations of fields are allowed
 * 
 */
public class NetworkPolicyPeer {

    /**
     * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24","2001:db9::/64") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.
     * 
     */
    public IPBlock ipBlock;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    public LabelSelector namespaceSelector;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    public LabelSelector podSelector;

    public NetworkPolicyPeer withIpBlock(IPBlock ipBlock) {
        this.ipBlock = ipBlock;
        return this;
    }

    public NetworkPolicyPeer withNamespaceSelector(LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public NetworkPolicyPeer withPodSelector(LabelSelector podSelector) {
        this.podSelector = podSelector;
        return this;
    }

}
