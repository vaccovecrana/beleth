package io.k8s.api.core.v1.httpgetaction;

/**
 * Scheme to use for connecting to the host. Defaults to HTTP.
 *
 * Possible enum values:
 *  - `&#34;HTTP&#34;` means that the scheme used will be http://
 *  - `&#34;HTTPS&#34;` means that the scheme used will be https://
 */
public enum Scheme {
  HTTP,

  HTTPS
}
