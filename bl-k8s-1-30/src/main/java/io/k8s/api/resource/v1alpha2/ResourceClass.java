package io.k8s.api.resource.v1alpha2;

import io.k8s.api.core.v1.NodeSelector;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;

/**
 * ResourceClass is used by administrators to influence how resources are allocated.
 *
 * This is an alpha type and requires enabling the DynamicResourceAllocation feature gate.
 */
public class ResourceClass {
  public String apiVersion;

  public String driverName;

  public String kind;

  public ObjectMeta metadata;

  public ResourceClassParametersReference parametersRef;

  public Boolean structuredParameters;

  public NodeSelector suitableNodes;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ResourceClass apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * DriverName defines the name of the dynamic resource driver that is used for allocation of a ResourceClaim that uses this class.
   *
   * Resource drivers have a unique name in forward domain order (acme.example.com).
   */
  public ResourceClass driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ResourceClass kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ResourceClass metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public ResourceClass parametersRef(ResourceClassParametersReference parametersRef) {
    this.parametersRef = parametersRef;
    return this;
  }

  /**
   * If and only if allocation of claims using this class is handled via structured parameters, then StructuredParameters must be set to true.
   */
  public ResourceClass structuredParameters(Boolean structuredParameters) {
    this.structuredParameters = structuredParameters;
    return this;
  }

  public ResourceClass suitableNodes(NodeSelector suitableNodes) {
    this.suitableNodes = suitableNodes;
    return this;
  }

  public static ResourceClass resourceClass() {
    return new ResourceClass();
  }
}
