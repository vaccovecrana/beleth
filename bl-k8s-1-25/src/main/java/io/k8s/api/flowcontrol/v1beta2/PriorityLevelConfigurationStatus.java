
package io.k8s.api.flowcontrol.v1beta2;

import java.util.List;


/**
 * PriorityLevelConfigurationStatus represents the current state of a "request-priority".
 * 
 */
public class PriorityLevelConfigurationStatus {

    /**
     * `conditions` is the current state of "request-priority".
     * 
     */
    public List<PriorityLevelConfigurationCondition> conditions;

    public PriorityLevelConfigurationStatus withConditions(List<PriorityLevelConfigurationCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

}
