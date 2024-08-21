package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ResourceHealth represents the health of a resource. It has the latest device health information. This is a part of KEP https://kep.k8s.io/4680 and historical health changes are planned to be added in future iterations of a KEP.
 */
public class ResourceHealth {
  public String health;

  public String resourceID;

  /**
   * Health of the resource. can be one of:
   *  - Healthy: operates as normal
   *  - Unhealthy: reported unhealthy. We consider this a temporary health issue
   *               since we do not have a mechanism today to distinguish
   *               temporary and permanent issues.
   *  - Unknown: The status cannot be determined.
   *             For example, Device Plugin got unregistered and hasn&#39;t been re-registered since.
   *
   * In future we may want to introduce the PermanentlyUnhealthy Status.
   */
  public ResourceHealth health(String health) {
    this.health = health;
    return this;
  }

  /**
   * ResourceID is the unique identifier of the resource. See the ResourceID type for more information.
   */
  public ResourceHealth resourceID(String resourceID) {
    this.resourceID = resourceID;
    return this;
  }

  public static ResourceHealth resourceHealth() {
    return new ResourceHealth();
  }
}
