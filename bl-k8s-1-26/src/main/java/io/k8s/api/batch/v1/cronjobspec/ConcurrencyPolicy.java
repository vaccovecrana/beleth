package io.k8s.api.batch.v1.cronjobspec;

/**
 * Specifies how to treat concurrent executions of a Job. Valid values are: - &#34;Allow&#34; (default): allows CronJobs to run concurrently; - &#34;Forbid&#34;: forbids concurrent runs, skipping next run if previous run hasn&#39;t finished yet; - &#34;Replace&#34;: cancels currently running job and replaces it with a new one
 *
 * Possible enum values:
 *  - `&#34;Allow&#34;` allows CronJobs to run concurrently.
 *  - `&#34;Forbid&#34;` forbids concurrent runs, skipping next run if previous hasn&#39;t finished yet.
 *  - `&#34;Replace&#34;` cancels currently running job and replaces it with a new one.
 */
public enum ConcurrencyPolicy {
  Allow,

  Forbid,

  Replace
}
