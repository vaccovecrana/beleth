package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * VolumeMount describes a mounting of a Volume within a container.
 */
public class VolumeMount {
  public String mountPath;

  public String mountPropagation;

  public String name;

  public Boolean readOnly;

  public String recursiveReadOnly;

  public String subPath;

  public String subPathExpr;

  /**
   * Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
   */
  public VolumeMount mountPath(String mountPath) {
    this.mountPath = mountPath;
    return this;
  }

  /**
   * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationNone is used. This field is beta in 1.10. When RecursiveReadOnly is set to IfPossible or to Enabled, MountPropagation must be None or unspecified (which defaults to None).
   */
  public VolumeMount mountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
    return this;
  }

  /**
   * This must match the Name of a Volume.
   */
  public VolumeMount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   */
  public VolumeMount readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * RecursiveReadOnly specifies whether read-only mounts should be handled recursively.
   *
   * If ReadOnly is false, this field has no meaning and must be unspecified.
   *
   * If ReadOnly is true, and this field is set to Disabled, the mount is not made recursively read-only.  If this field is set to IfPossible, the mount is made recursively read-only, if it is supported by the container runtime.  If this field is set to Enabled, the mount is made recursively read-only if it is supported by the container runtime, otherwise the pod will not be started and an error will be generated to indicate the reason.
   *
   * If this field is set to IfPossible or Enabled, MountPropagation must be set to None (or be unspecified, which defaults to None).
   *
   * If this field is not specified, it is treated as an equivalent of Disabled.
   */
  public VolumeMount recursiveReadOnly(String recursiveReadOnly) {
    this.recursiveReadOnly = recursiveReadOnly;
    return this;
  }

  /**
   * Path within the volume from which the container&#39;s volume should be mounted. Defaults to &#34;&#34; (volume&#39;s root).
   */
  public VolumeMount subPath(String subPath) {
    this.subPath = subPath;
    return this;
  }

  /**
   * Expanded path within the volume from which the container&#39;s volume should be mounted. Behaves similarly to SubPath but environment variable references $(VAR_NAME) are expanded using the container&#39;s environment. Defaults to &#34;&#34; (volume&#39;s root). SubPathExpr and SubPath are mutually exclusive.
   */
  public VolumeMount subPathExpr(String subPathExpr) {
    this.subPathExpr = subPathExpr;
    return this;
  }
}
