package io.k8s.api.rbac.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.util.List;

/**
 * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
 */
public class AggregationRule {
  public List<LabelSelector> clusterRoleSelectors;

  /**
   * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole&#39;s permissions will be added
   */
  public AggregationRule clusterRoleSelectors(List<LabelSelector> clusterRoleSelectors) {
    this.clusterRoleSelectors = clusterRoleSelectors;
    return this;
  }

  public static AggregationRule aggregationRule() {
    return new AggregationRule();
  }
}
