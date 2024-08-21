package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;

/**
 * NetworkPolicyPeer describes a peer to allow traffic to/from. Only certain combinations of fields are allowed
 */
public class NetworkPolicyPeer {
  public IPBlock ipBlock;

  public LabelSelector namespaceSelector;

  public LabelSelector podSelector;

  public NetworkPolicyPeer ipBlock(IPBlock ipBlock) {
    this.ipBlock = ipBlock;
    return this;
  }

  public NetworkPolicyPeer namespaceSelector(LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

  public NetworkPolicyPeer podSelector(LabelSelector podSelector) {
    this.podSelector = podSelector;
    return this;
  }

  public static NetworkPolicyPeer networkPolicyPeer() {
    return new NetworkPolicyPeer();
  }
}
