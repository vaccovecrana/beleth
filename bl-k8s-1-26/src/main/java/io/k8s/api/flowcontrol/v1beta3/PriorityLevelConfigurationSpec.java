
package io.k8s.api.flowcontrol.v1beta3;



/**
 * PriorityLevelConfigurationSpec specifies the configuration of a priority level.
 * 
 */
public class PriorityLevelConfigurationSpec {

    /**
     * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
     *   - How are requests for this priority level limited?
     *   - What should be done with requests that exceed the limit?
     * 
     */
    public LimitedPriorityLevelConfiguration limited;
    /**
     * `type` indicates whether this priority level is subject to limitation on request execution.  A value of `"Exempt"` means that requests of this priority level are not subject to a limit (and thus are never queued) and do not detract from the capacity made available to other priority levels.  A value of `"Limited"` means that (a) requests of this priority level _are_ subject to limits and (b) some of the server's limited capacity is made available exclusively to this priority level. Required.
     * (Required)
     * 
     */
    public String type;

    public PriorityLevelConfigurationSpec withLimited(LimitedPriorityLevelConfiguration limited) {
        this.limited = limited;
        return this;
    }

    public PriorityLevelConfigurationSpec withType(String type) {
        this.type = type;
        return this;
    }

}
