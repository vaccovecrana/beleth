package io.k8s.api.storagemigration.v1alpha1;

import java.lang.String;

/**
 * Describes the state of a migration at a certain point.
 */
public class MigrationCondition {
  public String lastUpdateTime;

  public String message;

  public String reason;

  public String status;

  public String type;

  /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   */
  public MigrationCondition lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * A human readable message indicating details about the transition.
   */
  public MigrationCondition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The reason for the condition&#39;s last transition.
   */
  public MigrationCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   */
  public MigrationCondition status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Type of the condition.
   */
  public MigrationCondition type(String type) {
    this.type = type;
    return this;
  }

  public static MigrationCondition migrationCondition() {
    return new MigrationCondition();
  }
}
