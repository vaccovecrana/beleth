package io.k8s.api.certificates.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * CertificateSigningRequest objects provide a mechanism to obtain x509 certificates by submitting a certificate signing request, and having it asynchronously approved and issued.
 *
 * Kubelets use this API to obtain:
 *  1. client certificates to authenticate to kube-apiserver (with the &#34;kubernetes.io/kube-apiserver-client-kubelet&#34; signerName).
 *  2. serving certificates for TLS endpoints kube-apiserver can connect to securely (with the &#34;kubernetes.io/kubelet-serving&#34; signerName).
 *
 * This API can be used to request client certificates to authenticate to kube-apiserver (with the &#34;kubernetes.io/kube-apiserver-client&#34; signerName), or to obtain certificates from custom non-Kubernetes signers.
 */
public class CertificateSigningRequest {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public CertificateSigningRequestSpec spec;

  public CertificateSigningRequestStatus status;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public CertificateSigningRequest apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public CertificateSigningRequest kind(String kind) {
    this.kind = kind;
    return this;
  }

  public CertificateSigningRequest metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public CertificateSigningRequest spec(CertificateSigningRequestSpec spec) {
    this.spec = spec;
    return this;
  }

  public CertificateSigningRequest status(CertificateSigningRequestStatus status) {
    this.status = status;
    return this;
  }

  public static CertificateSigningRequest certificateSigningRequest() {
    return new CertificateSigningRequest();
  }
}
