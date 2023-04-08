
package io.k8s.apimachinery.pkg.apis.meta.v1;



/**
 * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 * 
 */
public class StatusCause {

    /**
     * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
     * 
     * Examples:
     *   "name" - the field "name" on the current resource
     *   "items[0].name" - the field "name" on the first array entry in "items"
     * 
     */
    public String field;
    /**
     * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
     * 
     */
    public String message;
    /**
     * A machine-readable description of the cause of the error. If this value is empty there is no information available.
     * 
     */
    public String reason;

    public StatusCause withField(String field) {
        this.field = field;
        return this;
    }

    public StatusCause withMessage(String message) {
        this.message = message;
        return this;
    }

    public StatusCause withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
