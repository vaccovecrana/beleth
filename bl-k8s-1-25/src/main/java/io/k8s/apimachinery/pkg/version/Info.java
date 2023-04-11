package io.k8s.apimachinery.pkg.version;

import java.lang.String;

/**
 * Info contains versioning information. how we&#39;ll want to distribute that information.
 */
public class Info {
  public String buildDate;

  public String compiler;

  public String gitCommit;

  public String gitTreeState;

  public String gitVersion;

  public String goVersion;

  public String major;

  public String minor;

  public String platform;

  public Info buildDate(String buildDate) {
    this.buildDate = buildDate;
    return this;
  }

  public Info compiler(String compiler) {
    this.compiler = compiler;
    return this;
  }

  public Info gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  public Info gitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
    return this;
  }

  public Info gitVersion(String gitVersion) {
    this.gitVersion = gitVersion;
    return this;
  }

  public Info goVersion(String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

  public Info major(String major) {
    this.major = major;
    return this;
  }

  public Info minor(String minor) {
    this.minor = minor;
    return this;
  }

  public Info platform(String platform) {
    this.platform = platform;
    return this;
  }
}
