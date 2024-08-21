package io.k8s.api.resource.v1alpha3;

import java.lang.String;
import java.util.List;

/**
 * DeviceConstraint must have exactly one field set besides Requests.
 */
public class DeviceConstraint {
  public String matchAttribute;

  public List<String> requests;

  /**
   * MatchAttribute requires that all devices in question have this attribute and that its type and value are the same across those devices.
   *
   * For example, if you specified &#34;dra.example.com/numa&#34; (a hypothetical example!), then only devices in the same NUMA node will be chosen. A device which does not have that attribute will not be chosen. All devices should use a value of the same type for this attribute because that is part of its specification, but if one device doesn&#39;t, then it also will not be chosen.
   *
   * Must include the domain qualifier.
   */
  public DeviceConstraint matchAttribute(String matchAttribute) {
    this.matchAttribute = matchAttribute;
    return this;
  }

  /**
   * Requests is a list of the one or more requests in this claim which must co-satisfy this constraint. If a request is fulfilled by multiple devices, then all of the devices must satisfy the constraint. If this is not specified, this constraint applies to all requests in this claim.
   */
  public DeviceConstraint requests(List<String> requests) {
    this.requests = requests;
    return this;
  }

  public static DeviceConstraint deviceConstraint() {
    return new DeviceConstraint();
  }
}
