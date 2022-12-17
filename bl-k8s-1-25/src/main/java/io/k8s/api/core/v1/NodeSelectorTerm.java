
package io.k8s.api.core.v1;

import java.util.List;


/**
 * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
 * 
 */
public class NodeSelectorTerm {

    /**
     * A list of node selector requirements by node's labels.
     * 
     */
    public List<NodeSelectorRequirement> matchExpressions;
    /**
     * A list of node selector requirements by node's fields.
     * 
     */
    public List<NodeSelectorRequirement> matchFields;

    public NodeSelectorTerm withMatchExpressions(List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public NodeSelectorTerm withMatchFields(List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
        return this;
    }

}
