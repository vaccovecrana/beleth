package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;
import java.util.List;

/**
 * Endpoints is a collection of endpoints that implement the actual service. Example:
 *
 * 	 Name: &#34;mysvc&#34;,
 * 	 Subsets: [
 * 	   {
 * 	     Addresses: [{&#34;ip&#34;: &#34;10.10.1.1&#34;}, {&#34;ip&#34;: &#34;10.10.2.2&#34;}],
 * 	     Ports: [{&#34;name&#34;: &#34;a&#34;, &#34;port&#34;: 8675}, {&#34;name&#34;: &#34;b&#34;, &#34;port&#34;: 309}]
 * 	   },
 * 	   {
 * 	     Addresses: [{&#34;ip&#34;: &#34;10.10.3.3&#34;}],
 * 	     Ports: [{&#34;name&#34;: &#34;a&#34;, &#34;port&#34;: 93}, {&#34;name&#34;: &#34;b&#34;, &#34;port&#34;: 76}]
 * 	   },
 * 	]
 */
public class Endpoints {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public List<EndpointSubset> subsets;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public Endpoints apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public Endpoints kind(String kind) {
    this.kind = kind;
    return this;
  }

  public Endpoints metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The set of all endpoints is the union of all subsets. Addresses are placed into subsets according to the IPs they share. A single address with multiple ports, some of which are ready and some of which are not (because they come from different containers) will result in the address being displayed in different subsets for the different ports. No address will appear in both Addresses and NotReadyAddresses in the same subset. Sets of addresses and ports that comprise a service.
   */
  public Endpoints subsets(List<EndpointSubset> subsets) {
    this.subsets = subsets;
    return this;
  }

  public static Endpoints endpoints() {
    return new Endpoints();
  }
}
