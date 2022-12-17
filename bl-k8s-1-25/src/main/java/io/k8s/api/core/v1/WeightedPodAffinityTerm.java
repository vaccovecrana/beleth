
package io.k8s.api.core.v1;



/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 * 
 */
public class WeightedPodAffinityTerm {

    /**
     * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running
     * (Required)
     * 
     */
    public PodAffinityTerm podAffinityTerm;
    /**
     * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
     * (Required)
     * 
     */
    public Integer weight;

    public WeightedPodAffinityTerm withPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
        return this;
    }

    public WeightedPodAffinityTerm withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

}
