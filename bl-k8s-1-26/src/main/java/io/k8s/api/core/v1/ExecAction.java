
package io.k8s.api.core.v1;

import java.util.List;


/**
 * ExecAction describes a "run in container" action.
 * 
 */
public class ExecAction {

    /**
     * Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    public List<String> command;

    public ExecAction withCommand(List<String> command) {
        this.command = command;
        return this;
    }

}
