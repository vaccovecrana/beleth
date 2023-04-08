
package io.k8s.api.flowcontrol.v1beta3;

import java.util.List;


/**
 * FlowSchemaStatus represents the current state of a FlowSchema.
 * 
 */
public class FlowSchemaStatus {

    /**
     * `conditions` is a list of the current states of FlowSchema.
     * 
     */
    public List<FlowSchemaCondition> conditions;

    public FlowSchemaStatus withConditions(List<FlowSchemaCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

}
