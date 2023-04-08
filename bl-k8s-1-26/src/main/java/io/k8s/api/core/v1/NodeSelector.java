
package io.k8s.api.core.v1;

import java.util.List;


/**
 * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
 * 
 */
public class NodeSelector {

    /**
     * Required. A list of node selector terms. The terms are ORed.
     * (Required)
     * 
     */
    public List<NodeSelectorTerm> nodeSelectorTerms;

    public NodeSelector withNodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
        return this;
    }

}
