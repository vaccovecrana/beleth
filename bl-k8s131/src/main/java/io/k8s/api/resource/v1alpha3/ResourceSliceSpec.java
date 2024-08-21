package io.k8s.api.resource.v1alpha3;

import io.k8s.api.core.v1.NodeSelector;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * ResourceSliceSpec contains the information published by the driver in one ResourceSlice.
 */
public class ResourceSliceSpec {
  public Boolean allNodes;

  public List<Device> devices;

  public String driver;

  public String nodeName;

  public NodeSelector nodeSelector;

  public ResourcePool pool;

  /**
   * AllNodes indicates that all nodes have access to the resources in the pool.
   *
   * Exactly one of NodeName, NodeSelector and AllNodes must be set.
   */
  public ResourceSliceSpec allNodes(Boolean allNodes) {
    this.allNodes = allNodes;
    return this;
  }

  /**
   * Devices lists some or all of the devices in this pool.
   *
   * Must not have more than 128 entries.
   */
  public ResourceSliceSpec devices(List<Device> devices) {
    this.devices = devices;
    return this;
  }

  /**
   * Driver identifies the DRA driver providing the capacity information. A field selector can be used to list only ResourceSlice objects with a certain driver name.
   *
   * Must be a DNS subdomain and should end with a DNS domain owned by the vendor of the driver. This field is immutable.
   */
  public ResourceSliceSpec driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * NodeName identifies the node which provides the resources in this pool. A field selector can be used to list only ResourceSlice objects belonging to a certain node.
   *
   * This field can be used to limit access from nodes to ResourceSlices with the same node name. It also indicates to autoscalers that adding new nodes of the same type as some old node might also make new resources available.
   *
   * Exactly one of NodeName, NodeSelector and AllNodes must be set. This field is immutable.
   */
  public ResourceSliceSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  public ResourceSliceSpec nodeSelector(NodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public ResourceSliceSpec pool(ResourcePool pool) {
    this.pool = pool;
    return this;
  }

  public static ResourceSliceSpec resourceSliceSpec() {
    return new ResourceSliceSpec();
  }
}
