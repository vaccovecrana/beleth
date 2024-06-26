package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;

import java.util.List;

/**
 * APIServiceStatus contains derived information about an API server
 */
public class APIServiceStatus {
  public List<APIServiceCondition> conditions;

  /**
   * Current service state of apiService.
   */
  public APIServiceStatus conditions(List<APIServiceCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public static APIServiceStatus aPIServiceStatus() {
    return new APIServiceStatus();
  }
}
