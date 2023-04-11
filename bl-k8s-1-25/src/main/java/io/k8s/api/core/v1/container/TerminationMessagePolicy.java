package io.k8s.api.core.v1.container;

/**
 * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
 *
 * Possible enum values:
 *  - `&#34;FallbackToLogsOnError&#34;` will read the most recent contents of the container logs for the container status message when the container exits with an error and the terminationMessagePath has no contents.
 *  - `&#34;File&#34;` is the default behavior and will set the container status message to the contents of the container&#39;s terminationMessagePath when the container exits.
 */
public enum TerminationMessagePolicy {
  FallbackToLogsOnError,

  File
}
