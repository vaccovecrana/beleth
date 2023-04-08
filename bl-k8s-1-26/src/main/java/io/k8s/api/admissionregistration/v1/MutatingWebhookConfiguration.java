
package io.k8s.api.admissionregistration.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
 * 
 */
public class MutatingWebhookConfiguration {

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
     * Webhooks is a list of webhooks and the affected resources and operations.
     * 
     */
    public List<MutatingWebhook> webhooks;

    public MutatingWebhookConfiguration withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public MutatingWebhookConfiguration withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public MutatingWebhookConfiguration withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public MutatingWebhookConfiguration withWebhooks(List<MutatingWebhook> webhooks) {
        this.webhooks = webhooks;
        return this;
    }

}
