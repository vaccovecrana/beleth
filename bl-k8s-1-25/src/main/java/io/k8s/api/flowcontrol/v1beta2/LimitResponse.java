
package io.k8s.api.flowcontrol.v1beta2;



/**
 * LimitResponse defines how to handle requests that can not be executed right now.
 * 
 */
public class LimitResponse {

    /**
     * QueuingConfiguration holds the configuration parameters for queuing
     * 
     */
    public QueuingConfiguration queuing;
    /**
     * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon arrival are rejected. Required.
     * (Required)
     * 
     */
    public String type;

    public LimitResponse withQueuing(QueuingConfiguration queuing) {
        this.queuing = queuing;
        return this;
    }

    public LimitResponse withType(String type) {
        this.type = type;
        return this;
    }

}
