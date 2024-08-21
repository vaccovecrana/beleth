package io.k8s.api.networking.v1alpha1;

/**
 * IPAddressSpec describe the attributes in an IP Address.
 */
public class IPAddressSpec {
  public ParentReference parentRef;

  public IPAddressSpec parentRef(ParentReference parentRef) {
    this.parentRef = parentRef;
    return this;
  }

  public static IPAddressSpec iPAddressSpec() {
    return new IPAddressSpec();
  }
}
