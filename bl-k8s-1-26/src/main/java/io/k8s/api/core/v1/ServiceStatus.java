package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.Condition;
import java.util.List;

/**
 * ServiceStatus represents the current status of a service.
 */
public class ServiceStatus {
  public List<Condition> conditions;

  public LoadBalancerStatus loadBalancer;

  /**
   * Current service state
   */
  public ServiceStatus conditions(List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ServiceStatus loadBalancer(LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
    return this;
  }
}
