
package io.k8s.apimachinery.pkg.apis.meta.v1;



/**
 * Status is a return value for calls that don't return other objects.
 * 
 */
public class Status {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * Suggested HTTP return code for this status, 0 if not set.
     * 
     */
    public Integer code;
    /**
     * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
     * 
     */
    public StatusDetails details;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * A human-readable description of the status of this operation.
     * 
     */
    public String message;
    /**
     * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
     * 
     */
    public ListMeta metadata;
    /**
     * A machine-readable description of why this operation is in the "Failure" status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
     * 
     */
    public String reason;
    /**
     * Status of the operation. One of: "Success" or "Failure". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    public String status;

    public Status withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Status withCode(Integer code) {
        this.code = code;
        return this;
    }

    public Status withDetails(StatusDetails details) {
        this.details = details;
        return this;
    }

    public Status withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public Status withMessage(String message) {
        this.message = message;
        return this;
    }

    public Status withMetadata(ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Status withReason(String reason) {
        this.reason = reason;
        return this;
    }

    public Status withStatus(String status) {
        this.status = status;
        return this;
    }

}
