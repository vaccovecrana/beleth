
package io.k8s.api.node.v1;

import java.util.List;
import io.k8s.api.core.v1.Toleration;


/**
 * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
 * 
 */
public class Scheduling {

    /**
     * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
     * 
     */
    public NodeSelector nodeSelector;
    /**
     * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass during admission, effectively unioning the set of nodes tolerated by the pod and the RuntimeClass.
     * 
     */
    public List<Toleration> tolerations;

    public Scheduling withNodeSelector(NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
        return this;
    }

    public Scheduling withTolerations(List<Toleration> tolerations) {
        this.tolerations = tolerations;
        return this;
    }

}
