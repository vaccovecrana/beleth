package io.k8s.api.resource.v1alpha2;

import java.lang.String;

/**
 * NamedResourcesRequest is used in ResourceRequestModel.
 */
public class NamedResourcesRequest {
  public String selector;

  /**
   * Selector is a CEL expression which must evaluate to true if a resource instance is suitable. The language is as defined in https://kubernetes.io/docs/reference/using-api/cel/
   *
   * In addition, for each type NamedResourcesin AttributeValue there is a map that resolves to the corresponding value of the instance under evaluation. For example:
   *
   *    attributes.quantity[&#34;a&#34;].isGreaterThan(quantity(&#34;0&#34;)) &#38;&#38;
   *    attributes.stringslice[&#34;b&#34;].isSorted()
   */
  public NamedResourcesRequest selector(String selector) {
    this.selector = selector;
    return this;
  }
}
