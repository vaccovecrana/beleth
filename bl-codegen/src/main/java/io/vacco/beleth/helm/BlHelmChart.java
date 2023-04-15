package io.vacco.beleth.helm;

import java.net.URL;
import java.util.Objects;

public class BlHelmChart {

  public String repoAlias, name, version;
  public URL url;

  public BlHelmChart with(String repoAlias, String name, String version, URL url) {
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
