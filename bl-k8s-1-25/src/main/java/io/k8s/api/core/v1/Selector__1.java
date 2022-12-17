
package io.k8s.api.core.v1;

import java.util.LinkedHashMap;


/**
 * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
 * 
 */
public class Selector__1
    extends LinkedHashMap<String, String>
{


}
