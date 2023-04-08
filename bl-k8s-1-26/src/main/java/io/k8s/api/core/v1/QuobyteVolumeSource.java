
package io.k8s.api.core.v1;



/**
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
 * 
 */
public class QuobyteVolumeSource {

    /**
     * group to map volume access to Default is no group
     * 
     */
    public String group;
    /**
     * readOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
     * 
     */
    public Boolean readOnly;
    /**
     * registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
     * (Required)
     * 
     */
    public String registry;
    /**
     * tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
     * 
     */
    public String tenant;
    /**
     * user to map volume access to Defaults to serivceaccount user
     * 
     */
    public String user;
    /**
     * volume is a string that references an already created Quobyte volume by name.
     * (Required)
     * 
     */
    public String volume;

    public QuobyteVolumeSource withGroup(String group) {
        this.group = group;
        return this;
    }

    public QuobyteVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public QuobyteVolumeSource withRegistry(String registry) {
        this.registry = registry;
        return this;
    }

    public QuobyteVolumeSource withTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

    public QuobyteVolumeSource withUser(String user) {
        this.user = user;
        return this;
    }

    public QuobyteVolumeSource withVolume(String volume) {
        this.volume = volume;
        return this;
    }

}
