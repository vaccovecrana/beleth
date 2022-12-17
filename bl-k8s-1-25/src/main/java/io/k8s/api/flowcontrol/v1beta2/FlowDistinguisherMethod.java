
package io.k8s.api.flowcontrol.v1beta2;



/**
 * FlowDistinguisherMethod specifies the method of a flow distinguisher.
 * 
 */
public class FlowDistinguisherMethod {

    /**
     * `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". Required.
     * (Required)
     * 
     */
    public String type;

    public FlowDistinguisherMethod withType(String type) {
        this.type = type;
        return this;
    }

}
