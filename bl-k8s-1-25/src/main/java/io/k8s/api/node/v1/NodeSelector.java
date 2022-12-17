
package io.k8s.api.node.v1;

import java.util.LinkedHashMap;


/**
 * nodeSelector lists labels that must be present on nodes that support this RuntimeClass. Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will cause the pod to be rejected in admission.
 * 
 */
public class NodeSelector
    extends LinkedHashMap<String, String>
{


}
