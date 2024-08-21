package io.k8s.api.resource.v1alpha2;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;
import java.util.List;

/**
 * ResourceClassParameters defines resource requests for a ResourceClass in an in-tree format understood by Kubernetes.
 */
public class ResourceClassParameters {
  public String apiVersion;

  public List<ResourceFilter> filters;

  public ResourceClassParametersReference generatedFrom;

  public String kind;

  public ObjectMeta metadata;

  public List<VendorParameters> vendorParameters;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ResourceClassParameters apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Filters describes additional contraints that must be met when using the class.
   */
  public ResourceClassParameters filters(List<ResourceFilter> filters) {
    this.filters = filters;
    return this;
  }

  public ResourceClassParameters generatedFrom(ResourceClassParametersReference generatedFrom) {
    this.generatedFrom = generatedFrom;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ResourceClassParameters kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ResourceClassParameters metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * VendorParameters are arbitrary setup parameters for all claims using this class. They are ignored while allocating the claim. There must not be more than one entry per driver.
   */
  public ResourceClassParameters vendorParameters(List<VendorParameters> vendorParameters) {
    this.vendorParameters = vendorParameters;
    return this;
  }

  public static ResourceClassParameters resourceClassParameters() {
    return new ResourceClassParameters();
  }
}
