package io.k8s.api.certificates.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * CertificateSigningRequestList is a collection of CertificateSigningRequest objects
 */
public class CertificateSigningRequestList {
  public String apiVersion;

  public List<CertificateSigningRequest> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public CertificateSigningRequestList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * items is a collection of CertificateSigningRequest objects
   */
  public CertificateSigningRequestList items(List<CertificateSigningRequest> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public CertificateSigningRequestList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public CertificateSigningRequestList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static CertificateSigningRequestList certificateSigningRequestList() {
    return new CertificateSigningRequestList();
  }
}
