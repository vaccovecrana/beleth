package io.vacco.beleth.rt;

import io.vacco.beleth.xform.BlDocumentContext;
import org.buildobjects.process.*;
import java.io.ByteArrayInputStream;
import java.util.Optional;

import static io.vacco.beleth.rt.BlCmd.*;

public class BlKubeCtl {

  public static final String kubectl = "kubectl";

  public final BlDocumentContext ctx = new BlDocumentContext();

  public ProcResult apply(Object manifest) {
    var json = ctx.toJson(manifest);
    var pb = new ProcBuilder(kubectl, "apply", "-f", "-")
      .withInputStream(new ByteArrayInputStream(json.getBytes()));
    return runCmd(pb);
  }

  public String diff(Object manifest) {
    var json = ctx.toJson(manifest);
    var pb = new ProcBuilder(kubectl, "diff", "-f", "-")
      .withInputStream(new ByteArrayInputStream(json.getBytes()))
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
    var json = ctx.toJson(manifest);
    var pb = new ProcBuilder(kubectl, "delete", "-f", "-")
      .withInputStream(new ByteArrayInputStream(json.getBytes()))
      .ignoreExitStatus();
    return runCmd(pb);
  }

  public BlKubeCtl pause(long ms) {
    return BlCmd.pause(this, ms);
  }

}
