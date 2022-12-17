
package io.k8s.api.core.v1;



/**
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 * 
 */
public class PreferredSchedulingTerm {

    /**
     * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
     * (Required)
     * 
     */
    public NodeSelectorTerm preference;
    /**
     * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * (Required)
     * 
     */
    public Integer weight;

    public PreferredSchedulingTerm withPreference(NodeSelectorTerm preference) {
        this.preference = preference;
        return this;
    }

    public PreferredSchedulingTerm withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

}
