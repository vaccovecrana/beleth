package io.vacco.beleth.rt;

import io.vacco.beleth.xform.BlDocumentContext;
import org.buildobjects.process.*;
import java.io.ByteArrayInputStream;
import java.util.*;

import static io.vacco.beleth.rt.BlCmd.*;

public class BlHelmCtl {

  public static final String helm = "helm";

  public final BlDocumentContext ctx = new BlDocumentContext();

  public ProcResult repoUpdate() {
    return runCmd(new ProcBuilder(helm, "repo", "update"));
  }

  public BlHelmRepoListResponse[] repoList() {
    var pb = new ProcBuilder(helm, "repo", "list", "-o", "json");
    var out = runCmd(pb).getOutputString();
    return ctx.fromJson(out, BlHelmRepoListResponse[].class);
  }

  public boolean isRepoDefined(String repoUrl) {
    return Arrays.stream(repoList()).anyMatch(r -> r.url.equalsIgnoreCase(repoUrl));
  }

  public void repoSync(String name, String url) {
    // TODO should this include more options (i.e. more flags)?
    if (!isRepoDefined(url)) {
      var pb = new ProcBuilder(helm, "repo", "add", name, url);
      runCmd(pb);
    }
  }

  public ProcResult install(String release, String chart,
                            String namespace, String version,
                            Object values) {
    var pb = new ProcBuilder(helm, "install", release, chart);
    var valuesJson = ctx.toJson(values);
    var valuesRaw = ctx.fromJson(valuesJson, Map.class);
    var valuesYaml = ctx.toYaml(valuesRaw);

    if (namespace != null && namespace.trim().length() > 0) {
      pb.withArgs("--namespace", namespace);
    }
    if (version != null && version.trim().length() > 0) {
      pb.withArgs("--version", version);
    }
    pb
      .withArgs("-f", "-")
      .withInputStream(new ByteArrayInputStream(valuesYaml.getBytes()))
      .withNoTimeout();
    return runCmd(pb);
  }

  public ProcResult uninstall(String release, String namespace, boolean ignoreError) {
    var pb = new ProcBuilder(helm, "uninstall", release);
    if (namespace != null) {
      pb.withArgs("--namespace", namespace);
    }
    if (ignoreError) {
      pb.ignoreExitStatus();
    }
    return runCmd(pb);
  }

  public BlHelmStatusResponse[] listReleases(String namespace) {
    var pb = new ProcBuilder(helm, "list", "--all", "--output", "json");
    if (namespace != null) {
      pb.withArgs("--namespace", namespace);
    }
    var json = runCmd(pb).getOutputString();
    return ctx.fromJson(json, BlHelmStatusResponse[].class);
  }

  public boolean isReleaseDeployed(String release, String namespace, String version) {
    var status = listReleases(namespace);
    var dep = Arrays.stream(status)
      .filter(st -> st.name.equals(release))
      .filter(st -> st.status.equals("deployed"));
    if (version != null) {
      dep = dep.filter(st -> st.chart.contains(version));
    }
    return dep.findFirst().isPresent();
  }

  public Optional<ProcResult> sync(String release, String chart,
                                   String namespace, String version,
                                   Object values) {
    if (!isReleaseDeployed(release, namespace, version)) {
      return Optional.of(install(release, chart, namespace, version, values));
    }
    return Optional.empty();
  }

}
