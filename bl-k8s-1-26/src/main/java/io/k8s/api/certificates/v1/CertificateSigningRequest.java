
package io.k8s.api.certificates.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * CertificateSigningRequest objects provide a mechanism to obtain x509 certificates by submitting a certificate signing request, and having it asynchronously approved and issued.
 * 
 * Kubelets use this API to obtain:
 *  1. client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client-kubelet" signerName).
 *  2. serving certificates for TLS endpoints kube-apiserver can connect to securely (with the "kubernetes.io/kubelet-serving" signerName).
 * 
 * This API can be used to request client certificates to authenticate to kube-apiserver (with the "kubernetes.io/kube-apiserver-client" signerName), or to obtain certificates from custom non-Kubernetes signers.
 * 
 */
public class CertificateSigningRequest {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * CertificateSigningRequestSpec contains the certificate request.
     * (Required)
     * 
     */
    public CertificateSigningRequestSpec spec;
    /**
     * CertificateSigningRequestStatus contains conditions used to indicate approved/denied/failed status of the request, and the issued certificate.
     * 
     */
    public CertificateSigningRequestStatus status;

    public CertificateSigningRequest withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public CertificateSigningRequest withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public CertificateSigningRequest withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public CertificateSigningRequest withSpec(CertificateSigningRequestSpec spec) {
        this.spec = spec;
        return this;
    }

    public CertificateSigningRequest withStatus(CertificateSigningRequestStatus status) {
        this.status = status;
        return this;
    }

}
