package io.k8s.api.flowcontrol.v1;

import java.lang.String;

/**
 * FlowDistinguisherMethod specifies the method of a flow distinguisher.
 */
public class FlowDistinguisherMethod {
  public String type;

  /**
   * `type` is the type of flow distinguisher method The supported types are &#34;ByUser&#34; and &#34;ByNamespace&#34;. Required.
   */
  public FlowDistinguisherMethod type(String type) {
    this.type = type;
    return this;
  }

  public static FlowDistinguisherMethod flowDistinguisherMethod() {
    return new FlowDistinguisherMethod();
  }
}
