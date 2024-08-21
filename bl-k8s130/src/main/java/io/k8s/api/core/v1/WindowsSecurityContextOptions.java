package io.k8s.api.core.v1;

import java.lang.Boolean;
import java.lang.String;

/**
 * WindowsSecurityContextOptions contain Windows-specific options and credentials.
 */
public class WindowsSecurityContextOptions {
  public String gmsaCredentialSpec;

  public String gmsaCredentialSpecName;

  public Boolean hostProcess;

  public String runAsUserName;

  /**
   * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
   */
  public WindowsSecurityContextOptions gmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return this;
  }

  /**
   * GMSACredentialSpecName is the name of the GMSA credential spec to use.
   */
  public WindowsSecurityContextOptions gmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return this;
  }

  /**
   * HostProcess determines if a container should be run as a &#39;Host Process&#39; container. All of a Pod&#39;s containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers). In addition, if HostProcess is true then HostNetwork must also be set to true.
   */
  public WindowsSecurityContextOptions hostProcess(Boolean hostProcess) {
    this.hostProcess = hostProcess;
    return this;
  }

  /**
   * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   */
  public WindowsSecurityContextOptions runAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

  public static WindowsSecurityContextOptions windowsSecurityContextOptions() {
    return new WindowsSecurityContextOptions();
  }
}
