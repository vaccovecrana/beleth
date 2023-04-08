
package io.k8s.api.core.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;


/**
 * Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
 * 
 */
public class Secret {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
     * 
     */
    public Data__1 data;
    /**
     * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
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
    /**
     * stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
     * 
     */
    public StringData stringData;
    /**
     * Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
     * 
     */
    public String type;

    public Secret withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Secret withData(Data__1 data) {
        this.data = data;
        return this;
    }

    public Secret withImmutable(Boolean immutable) {
        this.immutable = immutable;
        return this;
    }

    public Secret withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Secret withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Secret withStringData(StringData stringData) {
        this.stringData = stringData;
        return this;
    }

    public Secret withType(String type) {
        this.type = type;
        return this;
    }

}
