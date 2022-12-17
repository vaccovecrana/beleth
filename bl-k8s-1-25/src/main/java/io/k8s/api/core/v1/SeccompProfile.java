
package io.k8s.api.core.v1;

import java.util.HashMap;
import java.util.Map;


/**
 * SeccompProfile defines a pod/container's seccomp profile settings. Only one profile source may be set.
 * 
 */
public class SeccompProfile {

    /**
     * localhostProfile indicates a profile defined in a file on the node should be used. The profile must be preconfigured on the node to work. Must be a descending path, relative to the kubelet's configured seccomp profile location. Must only be set if type is "Localhost".
     * 
     */
    public String localhostProfile;
    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     * Possible enum values:
     *  - `"Localhost"` indicates a profile defined in a file on the node should be used. The file's location relative to <kubelet-root-dir>/seccomp.
     *  - `"RuntimeDefault"` represents the default container runtime seccomp profile.
     *  - `"Unconfined"` indicates no seccomp profile is applied (A.K.A. unconfined).
     * (Required)
     * 
     */
    public SeccompProfile.Type type;

    public SeccompProfile withLocalhostProfile(String localhostProfile) {
        this.localhostProfile = localhostProfile;
        return this;
    }

    public SeccompProfile withType(SeccompProfile.Type type) {
        this.type = type;
        return this;
    }


    /**
     * type indicates which kind of seccomp profile will be applied. Valid options are:
     * 
     * Localhost - a profile defined in a file on the node should be used. RuntimeDefault - the container runtime default profile should be used. Unconfined - no profile should be applied.
     * 
     * Possible enum values:
     *  - `"Localhost"` indicates a profile defined in a file on the node should be used. The file's location relative to <kubelet-root-dir>/seccomp.
     *  - `"RuntimeDefault"` represents the default container runtime seccomp profile.
     *  - `"Unconfined"` indicates no seccomp profile is applied (A.K.A. unconfined).
     * 
     */
    public enum Type {

        LOCALHOST("Localhost"),
        RUNTIME_DEFAULT("RuntimeDefault"),
        UNCONFINED("Unconfined");
        private final String value;
        private final static Map<String, SeccompProfile.Type> CONSTANTS = new HashMap<String, SeccompProfile.Type>();

        static {
            for (SeccompProfile.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static SeccompProfile.Type fromValue(String value) {
            SeccompProfile.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
