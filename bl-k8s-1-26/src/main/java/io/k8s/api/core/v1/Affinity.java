
package io.k8s.api.core.v1;



/**
 * Affinity is a group of affinity scheduling rules.
 * 
 */
public class Affinity {

    /**
     * Node affinity is a group of node affinity scheduling rules.
     * 
     */
    public NodeAffinity nodeAffinity;
    /**
     * Pod affinity is a group of inter pod affinity scheduling rules.
     * 
     */
    public PodAffinity podAffinity;
    /**
     * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
     * 
     */
    public PodAntiAffinity podAntiAffinity;

    public Affinity withNodeAffinity(NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public Affinity withPodAffinity(PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }

    public Affinity withPodAntiAffinity(PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
        return this;
    }

}
