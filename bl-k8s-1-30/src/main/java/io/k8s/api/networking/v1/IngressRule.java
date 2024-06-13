package io.k8s.api.networking.v1;

import java.lang.String;

/**
 * IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
 */
public class IngressRule {
  public String host;

  public HTTPIngressRuleValue http;

  /**
   * host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the &#34;host&#34; part of the URI as defined in RFC 3986: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to
   *    the IP in the Spec of the parent Ingress.
   * 2. The `:` delimiter is not respected because ports are not allowed.
   * 	  Currently the port of an Ingress is implicitly :80 for http and
   * 	  :443 for https.
   * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
   *
   * host can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.bar.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. &#34;<code>*</code>.foo.com&#34;). The wildcard character &#39;<code>*</code>&#39; must appear by itself as the first DNS label and matches only a single label. You cannot have a wildcard label by itself (e.g. Host == &#34;<code>*</code>&#34;). Requests will be matched against the Host field in the following way: 1. If host is precise, the request matches this rule if the http host header is equal to Host. 2. If host is a wildcard, then the request matches this rule if the http host header is to equal to the suffix (removing the first label) of the wildcard rule.
   */
  public IngressRule host(String host) {
    this.host = host;
    return this;
  }

  public IngressRule http(HTTPIngressRuleValue http) {
    this.http = http;
    return this;
  }

  public static IngressRule ingressRule() {
    return new IngressRule();
  }
}
