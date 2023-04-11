package io.k8s.api.core.v1;

import java.lang.String;

/**
 * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
 *
 * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod&#39;s container.
 */
public class GitRepoVolumeSource {
  public String directory;

  public String repository;

  public String revision;

  /**
   * directory is the target directory name. Must not contain or start with &#39;..&#39;.  If &#39;.&#39; is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
   */
  public GitRepoVolumeSource directory(String directory) {
    this.directory = directory;
    return this;
  }

  /**
   * repository is the URL
   */
  public GitRepoVolumeSource repository(String repository) {
    this.repository = repository;
    return this;
  }

  /**
   * revision is the commit hash for the specified revision.
   */
  public GitRepoVolumeSource revision(String revision) {
    this.revision = revision;
    return this;
  }
}
