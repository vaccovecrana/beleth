package io.k8s.api.certificates.v1;

import java.lang.String;

/**
 * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
 */
public class CertificateSigningRequestCondition {
  public String lastTransitionTime;

  public String lastUpdateTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public CertificateSigningRequestCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public CertificateSigningRequestCondition lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * message contains a human readable message with details about the request state
   */
  public CertificateSigningRequestCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * reason indicates a brief reason for the request state
   */
  public CertificateSigningRequestCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;.
   */
  public CertificateSigningRequestCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * type of the condition. Known conditions are &#34;Approved&#34;, &#34;Denied&#34;, and &#34;Failed&#34;.
   *
   * An &#34;Approved&#34; condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
   *
   * A &#34;Denied&#34; condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
   *
   * A &#34;Failed&#34; condition is added via the /status subresource, indicating the signer failed to issue the certificate.
   *
   * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
   *
   * Only one condition of a given type is allowed.
   */
  public CertificateSigningRequestCondition type(String type) {
    this.type = type;
    return this;
  }
}
