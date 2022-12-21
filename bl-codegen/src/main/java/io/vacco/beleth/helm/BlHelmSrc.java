package io.vacco.beleth.helm;

import java.io.Serializable;

public class BlHelmSrc implements Serializable {
  public String repoAlias, chart, version;
}
