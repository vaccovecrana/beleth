package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;

/**
 * ServiceAccount binds together: <code>*</code> a name, understood by users, and perhaps by peripheral systems, for an identity <code>*</code> a principal that can be authenticated and authorized <code>*</code> a set of secrets
 */
public class ServiceAccount {
  public String apiVersion;

  public Boolean automountServiceAccountToken;

  public List<LocalObjectReference> imagePullSecrets;

  public String kind;

  public ObjectMeta metadata;

  public List<ObjectReference> secrets;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public ServiceAccount apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
   */
  public ServiceAccount automountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

  /**
   * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
   */
  public ServiceAccount imagePullSecrets(List<LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public ServiceAccount kind(String kind) {
    this.kind = kind;
    return this;
  }

  public ServiceAccount metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Secrets is a list of the secrets in the same namespace that pods running using this ServiceAccount are allowed to use. Pods are only limited to this list if this service account has a &#34;kubernetes.io/enforce-mountable-secrets&#34; annotation set to &#34;true&#34;. This field should not be used to find auto-generated service account token secrets for use outside of pods. Instead, tokens can be requested directly using the TokenRequest API, or service account token secrets can be manually created. More info: https://kubernetes.io/docs/concepts/configuration/secret
   */
  public ServiceAccount secrets(List<ObjectReference> secrets) {
    this.secrets = secrets;
    return this;
  }
}
