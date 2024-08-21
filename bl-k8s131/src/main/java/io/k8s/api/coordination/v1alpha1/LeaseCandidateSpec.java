package io.k8s.api.coordination.v1alpha1;

import java.lang.String;
import java.util.List;

/**
 * LeaseCandidateSpec is a specification of a Lease.
 */
public class LeaseCandidateSpec {
  public String binaryVersion;

  public String emulationVersion;

  public String leaseName;

  public String pingTime;

  public List<String> preferredStrategies;

  public String renewTime;

  /**
   * BinaryVersion is the binary version. It must be in a semver format without leading `v`. This field is required when strategy is &#34;OldestEmulationVersion&#34;
   */
  public LeaseCandidateSpec binaryVersion(String binaryVersion) {
    this.binaryVersion = binaryVersion;
    return this;
  }

  /**
   * EmulationVersion is the emulation version. It must be in a semver format without leading `v`. EmulationVersion must be less than or equal to BinaryVersion. This field is required when strategy is &#34;OldestEmulationVersion&#34;
   */
  public LeaseCandidateSpec emulationVersion(String emulationVersion) {
    this.emulationVersion = emulationVersion;
    return this;
  }

  /**
   * LeaseName is the name of the lease for which this candidate is contending. This field is immutable.
   */
  public LeaseCandidateSpec leaseName(String leaseName) {
    this.leaseName = leaseName;
    return this;
  }

  /**
   * MicroTime is version of Time with microsecond level precision.
   */
  public LeaseCandidateSpec pingTime(String pingTime) {
    this.pingTime = pingTime;
    return this;
  }

  /**
   * PreferredStrategies indicates the list of strategies for picking the leader for coordinated leader election. The list is ordered, and the first strategy supersedes all other strategies. The list is used by coordinated leader election to make a decision about the final election strategy. This follows as - If all clients have strategy X as the first element in this list, strategy X will be used. - If a candidate has strategy [X] and another candidate has strategy [Y, X], Y supersedes X and strategy Y
   *   will be used.
   * - If a candidate has strategy [X, Y] and another candidate has strategy [Y, X], this is a user error and leader
   *   election will not operate the Lease until resolved.
   * (Alpha) Using this field requires the CoordinatedLeaderElection feature gate to be enabled.
   */
  public LeaseCandidateSpec preferredStrategies(List<String> preferredStrategies) {
    this.preferredStrategies = preferredStrategies;
    return this;
  }

  /**
   * MicroTime is version of Time with microsecond level precision.
   */
  public LeaseCandidateSpec renewTime(String renewTime) {
    this.renewTime = renewTime;
    return this;
  }

  public static LeaseCandidateSpec leaseCandidateSpec() {
    return new LeaseCandidateSpec();
  }
}
