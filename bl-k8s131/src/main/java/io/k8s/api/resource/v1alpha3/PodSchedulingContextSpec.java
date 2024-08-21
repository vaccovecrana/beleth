package io.k8s.api.resource.v1alpha3;

import java.lang.String;
import java.util.List;

/**
 * PodSchedulingContextSpec describes where resources for the Pod are needed.
 */
public class PodSchedulingContextSpec {
  public List<String> potentialNodes;

  public String selectedNode;

  /**
   * PotentialNodes lists nodes where the Pod might be able to run.
   *
   * The size of this field is limited to 128. This is large enough for many clusters. Larger clusters may need more attempts to find a node that suits all pending resources. This may get increased in the future, but not reduced.
   */
  public PodSchedulingContextSpec potentialNodes(List<String> potentialNodes) {
    this.potentialNodes = potentialNodes;
    return this;
  }

  /**
   * SelectedNode is the node for which allocation of ResourceClaims that are referenced by the Pod and that use &#34;WaitForFirstConsumer&#34; allocation is to be attempted.
   */
  public PodSchedulingContextSpec selectedNode(String selectedNode) {
    this.selectedNode = selectedNode;
    return this;
  }

  public static PodSchedulingContextSpec podSchedulingContextSpec() {
    return new PodSchedulingContextSpec();
  }
}
