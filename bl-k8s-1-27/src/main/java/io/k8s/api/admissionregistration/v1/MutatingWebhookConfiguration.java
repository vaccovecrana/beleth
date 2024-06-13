package io.k8s.api.admissionregistration.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;
import java.util.List;

/**
 * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
 */
public class MutatingWebhookConfiguration {
  public String apiVersion;

  public String kind;

  public ObjectMeta metadata;

  public List<MutatingWebhook> webhooks;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public MutatingWebhookConfiguration apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public MutatingWebhookConfiguration kind(String kind) {
    this.kind = kind;
    return this;
  }

  public MutatingWebhookConfiguration metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Webhooks is a list of webhooks and the affected resources and operations.
   */
  public MutatingWebhookConfiguration webhooks(List<MutatingWebhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public static MutatingWebhookConfiguration mutatingWebhookConfiguration() {
    return new MutatingWebhookConfiguration();
  }
}
