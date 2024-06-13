package io.k8s.api.apps.v1;

import java.lang.String;

/**
 * DeploymentStrategy describes how to replace existing pods with new ones.
 */
public class DeploymentStrategy {
  public RollingUpdateDeployment rollingUpdate;

  public String type;

  public DeploymentStrategy rollingUpdate(RollingUpdateDeployment rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

  /**
   * Type of deployment. Can be &#34;Recreate&#34; or &#34;RollingUpdate&#34;. Default is RollingUpdate.
   */
  public DeploymentStrategy type(String type) {
    this.type = type;
    return this;
  }
}
