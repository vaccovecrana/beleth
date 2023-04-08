
package io.k8s.api.networking.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.Condition;


/**
 * NetworkPolicyStatus describe the current state of the NetworkPolicy.
 * 
 */
public class NetworkPolicyStatus {

    /**
     * Conditions holds an array of metav1.Condition that describe the state of the NetworkPolicy. Current service state
     * 
     */
    public List<Condition> conditions;

    public NetworkPolicyStatus withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

}
