package io.k8s.api.networking.v1alpha1;

import io.k8s.apimachinery.pkg.apis.meta.v1.Condition;
import java.util.List;

/**
 * ServiceCIDRStatus describes the current state of the ServiceCIDR.
 */
public class ServiceCIDRStatus {
  public List<Condition> conditions;

  /**
   * conditions holds an array of metav1.Condition that describe the state of the ServiceCIDR. Current service state
   */
  public ServiceCIDRStatus conditions(List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }
}
