package io.vacco.beleth.rt;

import com.google.gson.Gson;

public class BlKubeCtl {

  private final Gson g = new Gson();

  public BlKubeCtl apply(Object manifest) {

    return this;
  }

  public BlKubeCtl applyHelm(String repoAlias, String chart, Object values) {

    return this;
  }

  public BlKubeCtl applyHelm(String repoAlias, String chart, String version, Object values) {

    return this;
  }

  // TODO would it be possible to have a method that waits until
  // TODO a K8S resource has been created?

  public BlKubeCtl pause(long ms) {

    return this;
  }

  public String render(Object manifest) {
    return g.toJson(manifest);
  }

}
