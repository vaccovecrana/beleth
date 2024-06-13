package io.k8s.api.core.v1;

import java.lang.String;

/**
 * HTTPHeader describes a custom header to be used in HTTP probes
 */
public class HTTPHeader {
  public String name;

  public String value;

  /**
   * The header field name. This will be canonicalized upon output, so case-variant names will be understood as the same header.
   */
  public HTTPHeader name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The header field value
   */
  public HTTPHeader value(String value) {
    this.value = value;
    return this;
  }
}
