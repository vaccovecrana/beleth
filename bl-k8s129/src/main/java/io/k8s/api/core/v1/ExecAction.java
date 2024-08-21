package io.k8s.api.core.v1;

import java.lang.String;
import java.util.List;

/**
 * ExecAction describes a &#34;run in container&#34; action.
 */
public class ExecAction {
  public List<String> command;

  /**
   * Command is the command line to execute inside the container, the working directory for the command  is root (&#39;/&#39;) in the container&#39;s filesystem. The command is simply exec&#39;d, it is not run inside a shell, so traditional shell instructions (&#39;|&#39;, etc) won&#39;t work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
   */
  public ExecAction command(List<String> command) {
    this.command = command;
    return this;
  }

  public static ExecAction execAction() {
    return new ExecAction();
  }
}
