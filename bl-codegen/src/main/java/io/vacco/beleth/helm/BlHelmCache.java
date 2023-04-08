package io.vacco.beleth.helm;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.*;
import io.vacco.beleth.util.BlIterators;
import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.net.URL;

public class BlHelmCache {

  private final File cacheRepoRoot;
  private final Yaml yaml = new Yaml();
  private final ObjectMapper om = new ObjectMapper();

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

  public URL urlFor(String repoAlias, String chart, String version) {
    try  {
      var repoIdx = new File(cacheRepoRoot, String.format("%s-index.yaml", repoAlias));
      var repo = (ObjectNode) om.valueToTree(yaml.load(new FileReader(repoIdx)));
      var chartVers = (ArrayNode) repo.get("entries").get(chart);
      if (version == null) {
        var latest = (ObjectNode) chartVers.get(0);
        var url = latest.get("urls").get(0).textValue();
        return new URL(url);
      }
      var vers = BlIterators.listFrom(chartVers.elements());
      var oVer = vers.stream()
        .filter(n -> n.get("version").textValue().equals(version))
        .findFirst();
      return new URL(oVer.get().get("urls").get(0).textValue());
    } catch (Exception e) {
      throw new IllegalStateException(
        String.format(
          "Unable to load Helm chart: [repo: %s, chart: %s, ver: %s]",
          repoAlias, chart, version
        ), e
      );
    }
  }

}
