
package io.k8s.api.core.v1;

import java.util.List;


/**
 * NamespaceSpec describes the attributes on a Namespace.
 * 
 */
public class NamespaceSpec {

    /**
     * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
     * 
     */
    public List<String> finalizers;

    public NamespaceSpec withFinalizers(List<String> finalizers) {
        this.finalizers = finalizers;
        return this;
    }

}
