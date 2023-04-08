
package io.k8s.api.core.v1;



/**
 * VolumeMount describes a mounting of a Volume within a container.
 * 
 */
public class VolumeMount {

    /**
     * Path within the container at which the volume should be mounted.  Must not contain ':'.
     * (Required)
     * 
     */
    public String mountPath;
    /**
     * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10.
     * 
     */
    public String mountPropagation;
    /**
     * This must match the Name of a Volume.
     * (Required)
     * 
     */
    public String name;
    /**
     * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
     * 
     */
    public Boolean readOnly;
    /**
     * Path within the volume from which the container's volume should be mounted. Defaults to "" (volume's root).
     * 
     */
    public String subPath;
    /**
     * Expanded path within the volume from which the container's volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container's environment. Defaults to "" (volume's root). SubPathExpr and SubPath are mutually exclusive.
     * 
     */
    public String subPathExpr;

    public VolumeMount withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    public VolumeMount withMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
        return this;
    }

    public VolumeMount withName(String name) {
        this.name = name;
        return this;
    }

    public VolumeMount withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public VolumeMount withSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }

    public VolumeMount withSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
        return this;
    }

}
