
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * The node this Taint is attached to has the "effect" on any pod that does not tolerate the Taint.
 * 
 */
public class Taint {

    /**
     * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * Possible enum values:
     *  - `"NoExecute"` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
     *  - `"NoSchedule"` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
     *  - `"PreferNoSchedule"` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
     * (Required)
     * 
     */
    public Taint.Effect effect;
    /**
     * Required. The taint key to be applied to a node.
     * (Required)
     * 
     */
    public String key;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String timeAdded;
    /**
     * The taint value corresponding to the taint key.
     * 
     */
    public String value;

    public Taint withEffect(Taint.Effect effect) {
        this.effect = effect;
        return this;
    }

    public Taint withKey(String key) {
        this.key = key;
        return this;
    }

    public Taint withTimeAdded(String timeAdded) {
        this.timeAdded = timeAdded;
        return this;
    }

    public Taint withValue(String value) {
        this.value = value;
        return this;
    }


    /**
     * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * Possible enum values:
     *  - `"NoExecute"` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
     *  - `"NoSchedule"` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
     *  - `"PreferNoSchedule"` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
     * 
     */
    public enum Effect {

        NO_EXECUTE("NoExecute"),
        NO_SCHEDULE("NoSchedule"),
        PREFER_NO_SCHEDULE("PreferNoSchedule");
        private final String value;
        private final static Map<String, Taint.Effect> CONSTANTS = new HashMap<String, Taint.Effect>();

        static {
            for (Taint.Effect c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Effect(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static Taint.Effect fromValue(String value) {
            Taint.Effect constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
