
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * ConfigMap holds configuration data for pods to consume.
 * 
 */
public class ConfigMap {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
     * 
     */
    public BinaryData binaryData;
    /**
     * Data contains the configuration data. Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
     * 
     */
    public Data data;
    /**
     * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    public Boolean immutable;
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

    public ConfigMap withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ConfigMap withBinaryData(BinaryData binaryData) {
        this.binaryData = binaryData;
        return this;
    }

    public ConfigMap withData(Data data) {
        this.data = data;
        return this;
    }

    public ConfigMap withImmutable(Boolean immutable) {
        this.immutable = immutable;
        return this;
    }

    public ConfigMap withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ConfigMap withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
