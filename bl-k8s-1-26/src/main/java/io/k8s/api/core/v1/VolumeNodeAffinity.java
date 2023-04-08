
package io.k8s.api.core.v1;



/**
 * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
 * 
 */
public class VolumeNodeAffinity {

    /**
     * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
     * 
     */
    public NodeSelector required;

    public VolumeNodeAffinity withRequired(NodeSelector required) {
        this.required = required;
        return this;
    }

}
