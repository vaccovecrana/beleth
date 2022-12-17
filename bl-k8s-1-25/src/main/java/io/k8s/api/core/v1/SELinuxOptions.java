
package io.k8s.api.core.v1;



/**
 * SELinuxOptions are the labels to be applied to the container
 * 
 */
public class SELinuxOptions {

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    public String level;
    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    public String role;
    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    public String type;
    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    public String user;

    public SELinuxOptions withLevel(String level) {
        this.level = level;
        return this;
    }

    public SELinuxOptions withRole(String role) {
        this.role = role;
        return this;
    }

    public SELinuxOptions withType(String type) {
        this.type = type;
        return this;
    }

    public SELinuxOptions withUser(String user) {
        this.user = user;
        return this;
    }

}
