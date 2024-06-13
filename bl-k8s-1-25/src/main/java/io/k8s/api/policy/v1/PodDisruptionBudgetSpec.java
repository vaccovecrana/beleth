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

  public static PodDisruptionBudgetSpec podDisruptionBudgetSpec() {
    return new PodDisruptionBudgetSpec();
  }
}
