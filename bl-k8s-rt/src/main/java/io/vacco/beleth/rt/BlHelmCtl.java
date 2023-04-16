package io.vacco.beleth.rt;

import org.buildobjects.process.*;
import java.io.ByteArrayInputStream;
import java.util.*;

import static io.vacco.beleth.rt.BlCmd.*;

public class BlHelmCtl {

  public static final String helm = "helm";

  public ProcResult repoUpdate() {
    return runCmd(new ProcBuilder(helm, "repo", "update"));
  }

  public BlHelmRepoListResponse[] repoList() {
    var pb = new ProcBuilder(helm, "repo", "list", "-o", "yaml");
    var out = runCmd(pb).getOutputString();
    return y.loadAs(out, BlHelmRepoListResponse[].class);
  }

  public boolean isDefined(String repoUrl) {
    return Arrays.stream(repoList())
      .anyMatch(r -> r.url.equalsIgnoreCase(repoUrl));
  }

  public void repoSync(String name, String url) {
    // TODO should this include more options (i.e. more flags)?
    if (!isDefined(url)) {
      var pb = new ProcBuilder(helm, "repo", "add", name, url);
      runCmd(pb);
    }
  }

  public ProcResult install(String release, String chart,
                            String namespace, String version,
                            Object values) {
    var pb = new ProcBuilder(helm, "install", release, chart);
    var vYaml = y.dump(values);
    if (namespace != null && namespace.trim().length() > 0) {
      pb.withArgs("--namespace", namespace);
    }
    if (version != null && version.trim().length() > 0) {
      pb.withArgs("--version", version);
    }
    pb
      .withArgs("-f", "-")
      .withInputStream(new ByteArrayInputStream(vYaml.getBytes()))
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

  public BlHelmStatusResponse[] listAll(String namespace) {
    var pb = new ProcBuilder(helm, "list", "--all", "--output", "json");
    if (namespace != null) {
      pb.withArgs("--namespace", namespace);
    }
    return y.loadAs(runCmd(pb).getOutputString(), BlHelmStatusResponse[].class);
  }

  public boolean isDeployed(String release, String namespace, String version) {
    var status = listAll(namespace);
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
    if (!isDeployed(release, namespace, version)) {
      return Optional.of(install(release, chart, namespace, version, values));
    }
    return Optional.empty();
  }

  public BlHelmCtl pause(long ms) {
    return BlCmd.pause(this, ms);
  }

  public String render(Object manifest) {
    return y.dump(manifest);
  }

}
