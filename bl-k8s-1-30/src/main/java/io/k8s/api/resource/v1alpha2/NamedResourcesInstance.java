package io.k8s.api.resource.v1alpha2;

import java.lang.String;
import java.util.List;

/**
 * NamedResourcesInstance represents one individual hardware instance that can be selected based on its attributes.
 */
public class NamedResourcesInstance {
  public List<NamedResourcesAttribute> attributes;

  public String name;

  /**
   * Attributes defines the attributes of this resource instance. The name of each attribute must be unique.
   */
  public NamedResourcesInstance attributes(List<NamedResourcesAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Name is unique identifier among all resource instances managed by the driver on the node. It must be a DNS subdomain.
   */
  public NamedResourcesInstance name(String name) {
    this.name = name;
    return this;
  }
}
