
package io.k8s.api.core.v1;



/**
 * PodSchedulingGate is associated to a Pod to guard its scheduling.
 * 
 */
public class PodSchedulingGate {

    /**
     * Name of the scheduling gate. Each scheduling gate must have a unique name field.
     * (Required)
     * 
     */
    public String name;

    public PodSchedulingGate withName(String name) {
        this.name = name;
        return this;
    }

}
