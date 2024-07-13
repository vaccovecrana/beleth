package io.k8s.api.storage.v1;

import java.util.List;

/**
 * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
 */
public class CSINodeSpec {
  public List<CSINodeDriver> drivers;

  /**
   * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
   */
  public CSINodeSpec drivers(List<CSINodeDriver> drivers) {
    this.drivers = drivers;
    return this;
  }

  public static CSINodeSpec cSINodeSpec() {
    return new CSINodeSpec();
  }
}
