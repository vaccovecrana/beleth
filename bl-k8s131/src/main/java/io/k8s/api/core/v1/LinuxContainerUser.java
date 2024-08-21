package io.k8s.api.core.v1;

import java.lang.Long;
import java.util.List;

/**
 * LinuxContainerUser represents user identity information in Linux containers
 */
public class LinuxContainerUser {
  public Long gid;

  public List<Long> supplementalGroups;

  public Long uid;

  /**
   * GID is the primary gid initially attached to the first process in the container
   */
  public LinuxContainerUser gid(Long gid) {
    this.gid = gid;
    return this;
  }

  /**
   * SupplementalGroups are the supplemental groups initially attached to the first process in the container
   */
  public LinuxContainerUser supplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  /**
   * UID is the primary uid initially attached to the first process in the container
   */
  public LinuxContainerUser uid(Long uid) {
    this.uid = uid;
    return this;
  }

  public static LinuxContainerUser linuxContainerUser() {
    return new LinuxContainerUser();
  }
}
