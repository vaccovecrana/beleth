
package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.util.List;


/**
 * DeleteOptions may be provided when deleting an API object.
 * 
 */
public class DeleteOptions {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed
     * 
     */
    public List<String> dryRun;
    /**
     * The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately.
     * 
     */
    public Integer gracePeriodSeconds;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added to/removed from the object's finalizers list. Either this field or PropagationPolicy may be set, but not both.
     * 
     */
    public Boolean orphanDependents;
    /**
     * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
     * 
     */
    public Preconditions preconditions;
    /**
     * Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the dependents in the background; 'Foreground' - a cascading policy that deletes all dependents in the foreground.
     * 
     */
    public String propagationPolicy;

    public DeleteOptions withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public DeleteOptions withDryRun(List<String> dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    public DeleteOptions withGracePeriodSeconds(Integer gracePeriodSeconds) {
        this.gracePeriodSeconds = gracePeriodSeconds;
        return this;
    }

    public DeleteOptions withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public DeleteOptions withOrphanDependents(Boolean orphanDependents) {
        this.orphanDependents = orphanDependents;
        return this;
    }

    public DeleteOptions withPreconditions(Preconditions preconditions) {
        this.preconditions = preconditions;
        return this;
    }

    public DeleteOptions withPropagationPolicy(String propagationPolicy) {
        this.propagationPolicy = propagationPolicy;
        return this;
    }

}
