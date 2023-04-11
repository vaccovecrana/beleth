package io.k8s.api.apps.v1.daemonsetupdatestrategy;

/**
 * Type of daemon set update. Can be &#34;RollingUpdate&#34; or &#34;OnDelete&#34;. Default is RollingUpdate.
 *
 * Possible enum values:
 *  - `&#34;OnDelete&#34;` Replace the old daemons only when it&#39;s killed
 *  - `&#34;RollingUpdate&#34;` Replace the old daemons by new ones using rolling update i.e replace them on each node one after the other.
 */
public enum Type {
  OnDelete,

  RollingUpdate
}
