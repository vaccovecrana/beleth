package io.vacco.beleth.helm;

import java.io.Serializable;
import java.util.Objects;

public class BlHelmChart implements Serializable {

  public static final long serialVersionUID = 1;

  public String repoAlias, name, version, url;

  public BlHelmChart with(String repoAlias, String name, String version, String url) {
    this.repoAlias = Objects.requireNonNull(repoAlias);
    this.name = Objects.requireNonNull(name);
    this.version = version;
    this.url = Objects.requireNonNull(url);
    return this;
  }

  public String rootPackage() {
    return String.format("%s.%s", repoAlias, name);
  }

}
