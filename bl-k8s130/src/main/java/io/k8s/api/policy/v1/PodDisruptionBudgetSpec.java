package io.k8s.api.policy.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import java.lang.String;

/**
 * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
 */
public class PodDisruptionBudgetSpec {
  public String maxUnavailable;

  public String minAvailable;

  public LabelSelector selector;

  public String unhealthyPodEvictionPolicy;

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   */
  public PodDisruptionBudgetSpec maxUnavailable(String maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

  /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   */
  public PodDisruptionBudgetSpec minAvailable(String minAvailable) {
    this.minAvailable = minAvailable;
    return this;
  }

  public PodDisruptionBudgetSpec selector(LabelSelector selector) {
    this.selector = selector;
    return this;
  }

  /**
   * UnhealthyPodEvictionPolicy defines the criteria for when unhealthy pods should be considered for eviction. Current implementation considers healthy pods, as pods that have status.conditions item with type=&#34;Ready&#34;,status=&#34;True&#34;.
   *
   * Valid policies are IfHealthyBudget and AlwaysAllow. If no policy is specified, the default behavior will be used, which corresponds to the IfHealthyBudget policy.
   *
   * IfHealthyBudget policy means that running pods (status.phase=&#34;Running&#34;), but not yet healthy can be evicted only if the guarded application is not disrupted (status.currentHealthy is at least equal to status.desiredHealthy). Healthy pods will be subject to the PDB for eviction.
   *
   * AlwaysAllow policy means that all running pods (status.phase=&#34;Running&#34;), but not yet healthy are considered disrupted and can be evicted regardless of whether the criteria in a PDB is met. This means perspective running pods of a disrupted application might not get a chance to become healthy. Healthy pods will be subject to the PDB for eviction.
   *
   * Additional policies may be added in the future. Clients making eviction decisions should disallow eviction of unhealthy pods if they encounter an unrecognized policy in this field.
   *
   * This field is beta-level. The eviction API uses this field when the feature gate PDBUnhealthyPodEvictionPolicy is enabled (enabled by default).
   */
  public PodDisruptionBudgetSpec unhealthyPodEvictionPolicy(String unhealthyPodEvictionPolicy) {
    this.unhealthyPodEvictionPolicy = unhealthyPodEvictionPolicy;
    return this;
  }

  public static PodDisruptionBudgetSpec podDisruptionBudgetSpec() {
    return new PodDisruptionBudgetSpec();
  }
}
