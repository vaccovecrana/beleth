
package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.util.List;


/**
 * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
 * 
 */
public class LabelSelector {

    /**
     * matchExpressions is a list of label selector requirements. The requirements are ANDed.
     * 
     */
    public List<LabelSelectorRequirement> matchExpressions;
    /**
     * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
     * 
     */
    public MatchLabels matchLabels;

    public LabelSelector withMatchExpressions(List<LabelSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public LabelSelector withMatchLabels(MatchLabels matchLabels) {
        this.matchLabels = matchLabels;
        return this;
    }

}
