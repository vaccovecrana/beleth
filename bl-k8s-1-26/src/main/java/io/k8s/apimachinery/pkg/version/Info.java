
package io.k8s.apimachinery.pkg.version;



/**
 * Info contains versioning information. how we'll want to distribute that information.
 * 
 */
public class Info {

    /**
     * 
     * (Required)
     * 
     */
    public String buildDate;
    /**
     * 
     * (Required)
     * 
     */
    public String compiler;
    /**
     * 
     * (Required)
     * 
     */
    public String gitCommit;
    /**
     * 
     * (Required)
     * 
     */
    public String gitTreeState;
    /**
     * 
     * (Required)
     * 
     */
    public String gitVersion;
    /**
     * 
     * (Required)
     * 
     */
    public String goVersion;
    /**
     * 
     * (Required)
     * 
     */
    public String major;
    /**
     * 
     * (Required)
     * 
     */
    public String minor;
    /**
     * 
     * (Required)
     * 
     */
    public String platform;

    public Info withBuildDate(String buildDate) {
        this.buildDate = buildDate;
        return this;
    }

    public Info withCompiler(String compiler) {
        this.compiler = compiler;
        return this;
    }

    public Info withGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
        return this;
    }

    public Info withGitTreeState(String gitTreeState) {
        this.gitTreeState = gitTreeState;
        return this;
    }

    public Info withGitVersion(String gitVersion) {
        this.gitVersion = gitVersion;
        return this;
    }

    public Info withGoVersion(String goVersion) {
        this.goVersion = goVersion;
        return this;
    }

    public Info withMajor(String major) {
        this.major = major;
        return this;
    }

    public Info withMinor(String minor) {
        this.minor = minor;
        return this;
    }

    public Info withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

}
