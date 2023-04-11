package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * APIService represents a server for a particular GroupVersion. Name must be &#34;version.group&#34;.
 */
public class APIService {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public APIServiceSpec spec;

  public APIServiceStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public APIService apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public APIService kind(String kind) {
    this.kind = kind;
    return this;
  }

  public APIService metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public APIService spec(APIServiceSpec spec) {
    this.spec = spec;
    return this;
  }

  public APIService status(APIServiceStatus status) {
    this.status = status;
    return this;
  }
}
