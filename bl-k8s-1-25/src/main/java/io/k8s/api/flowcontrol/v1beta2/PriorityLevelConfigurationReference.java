
package io.k8s.api.flowcontrol.v1beta2;



/**
 * PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
 * 
 */
public class PriorityLevelConfigurationReference {

    /**
     * `name` is the name of the priority level configuration being referenced Required.
     * (Required)
     * 
     */
    public String name;

    public PriorityLevelConfigurationReference withName(String name) {
        this.name = name;
        return this;
    }

}
