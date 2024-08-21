package io.k8s.api.core.v1;

import java.util.List;

/**
 * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:
 *
 * 	{
 * 	  Addresses: [{&#34;ip&#34;: &#34;10.10.1.1&#34;}, {&#34;ip&#34;: &#34;10.10.2.2&#34;}],
 * 	  Ports:     [{&#34;name&#34;: &#34;a&#34;, &#34;port&#34;: 8675}, {&#34;name&#34;: &#34;b&#34;, &#34;port&#34;: 309}]
 * 	}
 *
 * The resulting set of endpoints can be viewed as:
 *
 * 	a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],
 * 	b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 */
public class EndpointSubset {
  public List<EndpointAddress> addresses;

  public List<EndpointAddress> notReadyAddresses;

  public List<EndpointPort> ports;

  /**
   * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
   */
  public EndpointSubset addresses(List<EndpointAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  /**
   * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
   */
  public EndpointSubset notReadyAddresses(List<EndpointAddress> notReadyAddresses) {
    this.notReadyAddresses = notReadyAddresses;
    return this;
  }

  /**
   * Port numbers available on the related IP addresses.
   */
  public EndpointSubset ports(List<EndpointPort> ports) {
    this.ports = ports;
    return this;
  }

  public static EndpointSubset endpointSubset() {
    return new EndpointSubset();
  }
}
