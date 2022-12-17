
package io.k8s.api.apps.v1;



/**
 * Spec to control the desired behavior of daemon set rolling update.
 * 
 */
public class RollingUpdateDaemonSet {

    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * 
     */
    public String maxSurge;
    /**
     * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
     * 
     */
    public String maxUnavailable;

    public RollingUpdateDaemonSet withMaxSurge(String maxSurge) {
        this.maxSurge = maxSurge;
        return this;
    }

    public RollingUpdateDaemonSet withMaxUnavailable(String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

}
