package io.k8s.api.discovery.v1.endpointslice;

/**
 * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: <code>*</code> IPv4: Represents an IPv4 Address. <code>*</code> IPv6: Represents an IPv6 Address. <code>*</code> FQDN: Represents a Fully Qualified Domain Name.
 *
 * Possible enum values:
 *  - `&#34;FQDN&#34;` represents a FQDN.
 *  - `&#34;IPv4&#34;` represents an IPv4 Address.
 *  - `&#34;IPv6&#34;` represents an IPv6 Address.
 */
public enum AddressType {
  FQDN,

  IPv4,

  IPv6
}
