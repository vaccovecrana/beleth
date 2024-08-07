package io.k8s.api.certificates.v1;

import io.k8s.api.certificates.v1.certificatesigningrequestspec.Extra;
import java.lang.Long;
import java.lang.String;
import java.util.List;

/**
 * CertificateSigningRequestSpec contains the certificate request.
 */
public class CertificateSigningRequestSpec {
  public Long expirationSeconds;

  public Extra extra;

  public List<String> groups;

  public String request;

  public String signerName;

  public String uid;

  public List<String> usages;

  public String username;

  /**
   * expirationSeconds is the requested duration of validity of the issued certificate. The certificate signer may issue a certificate with a different validity duration so a client must check the delta between the notBefore and and notAfter fields in the issued certificate to determine the actual duration.
   *
   * The v1.22+ in-tree implementations of the well-known Kubernetes signers will honor this field as long as the requested duration is not greater than the maximum duration they will honor per the --cluster-signing-duration CLI flag to the Kubernetes controller manager.
   *
   * Certificate signers may not honor this field for various reasons:
   *
   *   1. Old signer that is unaware of the field (such as the in-tree
   *      implementations prior to v1.22)
   *   2. Signer whose configured maximum is shorter than the requested duration
   *   3. Signer whose configured minimum is longer than the requested duration
   *
   * The minimum valid value for expirationSeconds is 600, i.e. 10 minutes.
   */
  public CertificateSigningRequestSpec expirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return this;
  }

  /**
   * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
   */
  public CertificateSigningRequestSpec extra(Extra extra) {
    this.extra = extra;
    return this;
  }

  /**
   * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
   */
  public CertificateSigningRequestSpec groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  /**
   * request contains an x509 certificate signing request encoded in a &#34;CERTIFICATE REQUEST&#34; PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
   */
  public CertificateSigningRequestSpec request(String request) {
    this.request = request;
    return this;
  }

  /**
   * signerName indicates the requested signer, and is a qualified name.
   *
   * List/watch requests for CertificateSigningRequests can filter on this field using a &#34;spec.signerName=NAME&#34; fieldSelector.
   *
   * Well-known Kubernetes signers are:
   *  1. &#34;kubernetes.io/kube-apiserver-client&#34;: issues client certificates that can be used to authenticate to kube-apiserver.
   *   Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the &#34;csrsigning&#34; controller in kube-controller-manager.
   *  2. &#34;kubernetes.io/kube-apiserver-client-kubelet&#34;: issues client certificates that kubelets use to authenticate to kube-apiserver.
   *   Requests for this signer can be auto-approved by the &#34;csrapproving&#34; controller in kube-controller-manager, and can be issued by the &#34;csrsigning&#34; controller in kube-controller-manager.
   *  3. &#34;kubernetes.io/kubelet-serving&#34; issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
   *   Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the &#34;csrsigning&#34; controller in kube-controller-manager.
   *
   * More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
   *
   * Custom signerNames can also be specified. The signer defines:
   *  1. Trust distribution: how trust (CA bundles) are distributed.
   *  2. Permitted subjects: and behavior when a disallowed subject is requested.
   *  3. Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.
   *  4. Required, permitted, or forbidden key usages / extended key usages.
   *  5. Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.
   *  6. Whether or not requests for CA certificates are allowed.
   */
  public CertificateSigningRequestSpec signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
   */
  public CertificateSigningRequestSpec uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * usages specifies a set of key usages requested in the issued certificate.
   *
   * Requests for TLS client certificates typically request: &#34;digital signature&#34;, &#34;key encipherment&#34;, &#34;client auth&#34;.
   *
   * Requests for TLS serving certificates typically request: &#34;key encipherment&#34;, &#34;digital signature&#34;, &#34;server auth&#34;.
   *
   * Valid values are:
   *  &#34;signing&#34;, &#34;digital signature&#34;, &#34;content commitment&#34;,
   *  &#34;key encipherment&#34;, &#34;key agreement&#34;, &#34;data encipherment&#34;,
   *  &#34;cert sign&#34;, &#34;crl sign&#34;, &#34;encipher only&#34;, &#34;decipher only&#34;, &#34;any&#34;,
   *  &#34;server auth&#34;, &#34;client auth&#34;,
   *  &#34;code signing&#34;, &#34;email protection&#34;, &#34;s/mime&#34;,
   *  &#34;ipsec end system&#34;, &#34;ipsec tunnel&#34;, &#34;ipsec user&#34;,
   *  &#34;timestamping&#34;, &#34;ocsp signing&#34;, &#34;microsoft sgc&#34;, &#34;netscape sgc&#34;
   */
  public CertificateSigningRequestSpec usages(List<String> usages) {
    this.usages = usages;
    return this;
  }

  /**
   * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
   */
  public CertificateSigningRequestSpec username(String username) {
    this.username = username;
    return this;
  }

  public static CertificateSigningRequestSpec certificateSigningRequestSpec() {
    return new CertificateSigningRequestSpec();
  }
}
