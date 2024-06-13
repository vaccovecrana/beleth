package io.k8s.api.networking.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.Condition;
import java.util.List;

/**
 * NetworkPolicyStatus describes the current state of the NetworkPolicy.
 */
public class NetworkPolicyStatus {
  public List<Condition> conditions;

  /**
   * conditions holds an array of metav1.Condition that describe the state of the NetworkPolicy. Current service state
   */
  public NetworkPolicyStatus conditions(List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public static NetworkPolicyStatus networkPolicyStatus() {
    return new NetworkPolicyStatus();
  }
}
