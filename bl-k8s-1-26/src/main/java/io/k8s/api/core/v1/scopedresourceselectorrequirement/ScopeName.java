package io.k8s.api.core.v1.scopedresourceselectorrequirement;

/**
 * The name of the scope that the selector applies to.
 *
 * Possible enum values:
 *  - `&#34;BestEffort&#34;` Match all pod objects that have best effort quality of service
 *  - `&#34;CrossNamespacePodAffinity&#34;` Match all pod objects that have cross-namespace pod (anti)affinity mentioned.
 *  - `&#34;NotBestEffort&#34;` Match all pod objects that do not have best effort quality of service
 *  - `&#34;NotTerminating&#34;` Match all pod objects where spec.activeDeadlineSeconds is nil
 *  - `&#34;PriorityClass&#34;` Match all pod objects that have priority class mentioned
 *  - `&#34;Terminating&#34;` Match all pod objects where spec.activeDeadlineSeconds &#62;=0
 */
public enum ScopeName {
  BestEffort,

  CrossNamespacePodAffinity,

  NotBestEffort,

  NotTerminating,

  PriorityClass,

  Terminating
}
