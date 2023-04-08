
package io.k8s.api.core.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
 * 
 */
public class PodAffinityTerm {

    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    public LabelSelector labelSelector;
    /**
     * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
     * 
     */
    public LabelSelector namespaceSelector;
    /**
     * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means "this pod's namespace".
     * 
     */
    public List<String> namespaces;
    /**
     * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
     * (Required)
     * 
     */
    public String topologyKey;

    public PodAffinityTerm withLabelSelector(LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    public PodAffinityTerm withNamespaceSelector(LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
        return this;
    }

    public PodAffinityTerm withNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public PodAffinityTerm withTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
        return this;
    }

}
