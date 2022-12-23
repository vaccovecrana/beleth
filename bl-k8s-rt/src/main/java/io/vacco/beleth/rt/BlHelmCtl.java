package io.vacco.beleth.rt;

import org.buildobjects.process.*;
import java.io.ByteArrayInputStream;
import java.util.Arrays;

import static io.vacco.beleth.rt.BlCmd.*;

public class BlHelmCtl {

  public static final String helm = "helm";
  private final BlYaml y = new BlYaml();

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

  public BlHelmStatusResponse[] status(String release, String namespace) {
    var pb = new ProcBuilder(helm, "list", "--all", "--output", "json");
    if (namespace != null) {
      pb.withArgs("--namespace", namespace);
    }
    return y.loadAs(runCmd(pb).getOutputString(), BlHelmStatusResponse[].class);
  }

  public boolean isDeployed(String release, String namespace, String version) {
    var status = status(release, namespace);
    var dep = Arrays.stream(status)
      .filter(st -> st.name.equals(release))
      .filter(st -> st.status.equals("deployed"));
    if (version != null) {
      dep = dep.filter(st -> st.app_version.contains(version));
    }
    return dep.findFirst().isPresent();
  }

  public BlHelmCtl pause(long ms) {
    return BlCmd.pause(this, ms);
  }

  public String render(Object manifest) {
    return y.dump(manifest);
  }

}
