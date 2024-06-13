package io.k8s.api.resource.v1alpha2;

import io.k8s.apimachinery.pkg.runtime.RawExtension;
import java.lang.String;
import java.util.List;

/**
 * StructuredResourceHandle is the in-tree representation of the allocation result.
 */
public class StructuredResourceHandle {
  public String nodeName;

  public List<DriverAllocationResult> results;

  public RawExtension vendorClaimParameters;

  public RawExtension vendorClassParameters;

  /**
   * NodeName is the name of the node providing the necessary resources if the resources are local to a node.
   */
  public StructuredResourceHandle nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * Results lists all allocated driver resources.
   */
  public StructuredResourceHandle results(List<DriverAllocationResult> results) {
    this.results = results;
    return this;
  }

  public StructuredResourceHandle vendorClaimParameters(RawExtension vendorClaimParameters) {
    this.vendorClaimParameters = vendorClaimParameters;
    return this;
  }

  public StructuredResourceHandle vendorClassParameters(RawExtension vendorClassParameters) {
    this.vendorClassParameters = vendorClassParameters;
    return this;
  }

  public static StructuredResourceHandle structuredResourceHandle() {
    return new StructuredResourceHandle();
  }
}
