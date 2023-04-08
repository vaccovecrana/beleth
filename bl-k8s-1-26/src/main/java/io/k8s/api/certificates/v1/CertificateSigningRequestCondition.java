
package io.k8s.api.certificates.v1;



/**
 * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
 * 
 */
public class CertificateSigningRequestCondition {

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastTransitionTime;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String lastUpdateTime;
    /**
     * message contains a human readable message with details about the request state
     * 
     */
    public String message;
    /**
     * reason indicates a brief reason for the request state
     * 
     */
    public String reason;
    /**
     * status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be "False" or "Unknown".
     * (Required)
     * 
     */
    public String status;
    /**
     * type of the condition. Known conditions are "Approved", "Denied", and "Failed".
     * 
     * An "Approved" condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
     * 
     * A "Denied" condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
     * 
     * A "Failed" condition is added via the /status subresource, indicating the signer failed to issue the certificate.
     * 
     * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
     * 
     * Only one condition of a given type is allowed.
     * (Required)
     * 
     */
    public String type;

    public CertificateSigningRequestCondition withLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    public CertificateSigningRequestCondition withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public CertificateSigningRequestCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    public CertificateSigningRequestCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public CertificateSigningRequestCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    public CertificateSigningRequestCondition withType(String type) {
        this.type = type;
        return this;
    }

}
