
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
 * 
 */
public class ScopedResourceSelectorRequirement {

    /**
     * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
     * 
     * Possible enum values:
     *  - `"DoesNotExist"`
     *  - `"Exists"`
     *  - `"In"`
     *  - `"NotIn"`
     * (Required)
     * 
     */
    public ScopedResourceSelectorRequirement.Operator operator;
    /**
     * The name of the scope that the selector applies to.
     * 
     * Possible enum values:
     *  - `"BestEffort"` Match all pod objects that have best effort quality of service
     *  - `"CrossNamespacePodAffinity"` Match all pod objects that have cross-namespace pod (anti)affinity mentioned.
     *  - `"NotBestEffort"` Match all pod objects that do not have best effort quality of service
     *  - `"NotTerminating"` Match all pod objects where spec.activeDeadlineSeconds is nil
     *  - `"PriorityClass"` Match all pod objects that have priority class mentioned
     *  - `"Terminating"` Match all pod objects where spec.activeDeadlineSeconds >=0
     * (Required)
     * 
     */
    public ScopedResourceSelectorRequirement.ScopeName scopeName;
    /**
     * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    public List<String> values;

    public ScopedResourceSelectorRequirement withOperator(ScopedResourceSelectorRequirement.Operator operator) {
        this.operator = operator;
        return this;
    }

    public ScopedResourceSelectorRequirement withScopeName(ScopedResourceSelectorRequirement.ScopeName scopeName) {
        this.scopeName = scopeName;
        return this;
    }

    public ScopedResourceSelectorRequirement withValues(List<String> values) {
        this.values = values;
        return this;
    }


    /**
     * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
     * 
     * Possible enum values:
     *  - `"DoesNotExist"`
     *  - `"Exists"`
     *  - `"In"`
     *  - `"NotIn"`
     * 
     */
    public enum Operator {

        DOES_NOT_EXIST("DoesNotExist"),
        EXISTS("Exists"),
        IN("In"),
        NOT_IN("NotIn");
        private final String value;
        private final static Map<String, ScopedResourceSelectorRequirement.Operator> CONSTANTS = new HashMap<String, ScopedResourceSelectorRequirement.Operator>();

        static {
            for (ScopedResourceSelectorRequirement.Operator c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Operator(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ScopedResourceSelectorRequirement.Operator fromValue(String value) {
            ScopedResourceSelectorRequirement.Operator constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The name of the scope that the selector applies to.
     * 
     * Possible enum values:
     *  - `"BestEffort"` Match all pod objects that have best effort quality of service
     *  - `"CrossNamespacePodAffinity"` Match all pod objects that have cross-namespace pod (anti)affinity mentioned.
     *  - `"NotBestEffort"` Match all pod objects that do not have best effort quality of service
     *  - `"NotTerminating"` Match all pod objects where spec.activeDeadlineSeconds is nil
     *  - `"PriorityClass"` Match all pod objects that have priority class mentioned
     *  - `"Terminating"` Match all pod objects where spec.activeDeadlineSeconds >=0
     * 
     */
    public enum ScopeName {

        BEST_EFFORT("BestEffort"),
        CROSS_NAMESPACE_POD_AFFINITY("CrossNamespacePodAffinity"),
        NOT_BEST_EFFORT("NotBestEffort"),
        NOT_TERMINATING("NotTerminating"),
        PRIORITY_CLASS("PriorityClass"),
        TERMINATING("Terminating");
        private final String value;
        private final static Map<String, ScopedResourceSelectorRequirement.ScopeName> CONSTANTS = new HashMap<String, ScopedResourceSelectorRequirement.ScopeName>();

        static {
            for (ScopedResourceSelectorRequirement.ScopeName c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ScopeName(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ScopedResourceSelectorRequirement.ScopeName fromValue(String value) {
            ScopedResourceSelectorRequirement.ScopeName constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
