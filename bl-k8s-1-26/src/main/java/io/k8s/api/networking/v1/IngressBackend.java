
package io.k8s.api.networking.v1;

import io.k8s.api.core.v1.TypedLocalObjectReference;


/**
 * IngressBackend describes all endpoints for a given service and port.
 * 
 */
public class IngressBackend {

    /**
     * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
     * 
     */
    public TypedLocalObjectReference resource;
    /**
     * IngressServiceBackend references a Kubernetes Service as a Backend.
     * 
     */
    public IngressServiceBackend service;

    public IngressBackend withResource(TypedLocalObjectReference resource) {
        this.resource = resource;
        return this;
    }

    public IngressBackend withService(IngressServiceBackend service) {
        this.service = service;
        return this;
    }

}
