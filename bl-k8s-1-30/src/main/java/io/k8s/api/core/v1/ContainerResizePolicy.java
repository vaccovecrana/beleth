package io.k8s.api.core.v1;

import java.lang.String;

/**
 * ContainerResizePolicy represents resource resize policy for the container.
 */
public class ContainerResizePolicy {
  public String resourceName;

  public String restartPolicy;

  /**
   * Name of the resource to which this resource resize policy applies. Supported values: cpu, memory.
   */
  public ContainerResizePolicy resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Restart policy to apply when specified resource is resized. If not specified, it defaults to NotRequired.
   */
  public ContainerResizePolicy restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }
}
