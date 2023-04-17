package io.vacco.beleth.helm;

import io.vacco.beleth.xform.BlDocumentContext;
import jakarta.json.JsonValue;
import java.io.*;
import java.net.URL;

public class BlHelmCache {

  public static final String
    kEntries = "entries",
    kUrls = "urls",
    kVersion = "version";

  private final File cacheRepoRoot;
  private final BlDocumentContext dc = new BlDocumentContext();

  public BlHelmCache(String helmHomeDir) {
    this.cacheRepoRoot = new File(helmHomeDir, "repository");
  }

  public BlHelmCache() {
    this(
      System.getenv("HELM_CACHE_HOME") == null
        ? String.format("%s/.cache/helm", System.getProperty("user.home"))
        : System.getenv("HELM_CACHE_HOME")
    );
  }

  public BlHelmChart chartFor(String repoAlias, String name, String version) {
    try  {
      var repoIdx = new File(cacheRepoRoot, String.format("%s-index.yaml", repoAlias));
      var repo = dc.loadTreeFromYaml(repoIdx.toURI().toURL()).get(0);
      var versions = repo.getJsonObject(kEntries).get(name).asJsonArray();
      if (version == null) {
        var latest = versions.getJsonObject(0);
        var url = latest.get(kUrls).asJsonArray().getString(0);
        return new BlHelmChart().with(repoAlias, name, null, url);
      }
      var oVer = versions.stream()
        .map(JsonValue::asJsonObject)
        .filter(jo -> jo.getString(kVersion).equals(version))
        .findFirst();
      return new BlHelmChart().with(
        repoAlias, name, version,
        oVer.get().getJsonArray(kUrls).getString(0)
      );
    } catch (Exception e) {
      throw new IllegalStateException(
        String.format(
          "Unable to load Helm chart: [repo: %s, chart: %s, ver: %s]",
          repoAlias, name, version
        ), e
      );
    }
  }

  public BlHelmChart chartFor(String repoAlias, String name) {
    return chartFor(repoAlias, name, null);
  }

}
