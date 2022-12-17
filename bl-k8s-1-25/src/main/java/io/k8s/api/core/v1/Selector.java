
package io.k8s.api.core.v1;

import java.util.LinkedHashMap;


/**
 * Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
 * 
 */
public class Selector
    extends LinkedHashMap<String, String>
{


}
