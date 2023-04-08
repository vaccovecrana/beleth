
package io.k8s.api.node.v1;



/**
 * Overhead structure represents the resource overhead associated with running a pod.
 * 
 */
public class Overhead {

    /**
     * PodFixed represents the fixed resource overhead associated with running a pod.
     * 
     */
    public PodFixed podFixed;

    public Overhead withPodFixed(PodFixed podFixed) {
        this.podFixed = podFixed;
        return this;
    }

}
