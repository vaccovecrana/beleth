
package io.k8s.api.core.v1;



/**
 * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
 * 
 * DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
 * 
 */
public class GitRepoVolumeSource {

    /**
     * directory is the target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     * 
     */
    public String directory;
    /**
     * repository is the URL
     * (Required)
     * 
     */
    public String repository;
    /**
     * revision is the commit hash for the specified revision.
     * 
     */
    public String revision;

    public GitRepoVolumeSource withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    public GitRepoVolumeSource withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    public GitRepoVolumeSource withRevision(String revision) {
        this.revision = revision;
        return this;
    }

}
