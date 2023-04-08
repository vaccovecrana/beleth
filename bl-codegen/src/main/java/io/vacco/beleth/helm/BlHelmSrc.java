package io.vacco.beleth.helm;

import java.io.Serializable;

public class BlHelmSrc implements Serializable {

  public static final long serialVersionUID = 1;

  public String repoAlias, chart, version;

  public static BlHelmSrc of(String repoAlias, String chart, String version) {
    var hs = new BlHelmSrc();
    hs.repoAlias = repoAlias;
    hs.chart = chart;
    hs.version = version;
    return hs;
  }
}
