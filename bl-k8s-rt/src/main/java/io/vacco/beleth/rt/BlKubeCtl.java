package io.vacco.beleth.rt;

import org.buildobjects.process.*;
import java.io.ByteArrayInputStream;
import java.util.Optional;

import static io.vacco.beleth.rt.BlCmd.*;

public class BlKubeCtl {

  public static final String kubectl = "kubectl";
  private final BlYaml y = new BlYaml();

  public ProcResult apply(Object manifest) {
    var yaml = y.dump(manifest);
    var pb = new ProcBuilder(kubectl, "apply", "-f", "-")
      .withInputStream(new ByteArrayInputStream(yaml.getBytes()));
    return runCmd(pb);
  }

  public String diff(Object manifest) {
    var yaml = y.dump(manifest);
    var pb = new ProcBuilder(kubectl, "diff", "-f", "-")
      .withInputStream(new ByteArrayInputStream(yaml.getBytes()))
      .ignoreExitStatus();
    var pr = runCmd(pb);
    int sc = pr.getExitValue();
    if (sc > 1) {
      var msg = String.join("\n", pr.getOutputString(), pr.getErrorString());
      throw new IllegalStateException(msg);
    }
    return pr.getOutputString();
  }

  public boolean isSynced(Object manifest) {
    var diff = diff(manifest);
    return diff.trim().length() == 0;
  }

  public Optional<ProcResult> sync(Object manifest) {
    if (!isSynced(manifest)) {
      return Optional.of(apply(manifest));
    }
    return Optional.empty();
  }

  public ProcResult delete(Object manifest) {
    var yaml = y.dump(manifest);
    var pb = new ProcBuilder(kubectl, "delete", "-f", "-")
      .withInputStream(new ByteArrayInputStream(yaml.getBytes()))
      .ignoreExitStatus();
    return runCmd(pb);
  }

  public BlKubeCtl pause(long ms) {
    return BlCmd.pause(this, ms);
  }

}
