package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;

/**
 * APIServiceSpec contains information for locating and communicating with a server. Only https is supported, though you are able to disable certificate verification.
 */
public class APIServiceSpec {
  public String caBundle;

  public String group;

  public Long groupPriorityMinimum;

  public Boolean insecureSkipTLSVerify;

  public ServiceReference service;

  public String version;

  public Long versionPriority;

  /**
   * CABundle is a PEM encoded CA bundle which will be used to validate an API server&#39;s serving certificate. If unspecified, system trust roots on the apiserver are used.
   */
  public APIServiceSpec caBundle(String caBundle) {
    this.caBundle = caBundle;
    return this;
  }

  /**
   * Group is the API group name this server hosts
   */
  public APIServiceSpec group(String group) {
    this.group = group;
    return this;
  }

  /**
   * GroupPriorityMininum is the priority this group should have at least. Higher priority means that the group is preferred by clients over lower priority ones. Note that other versions of this group might specify even higher GroupPriorityMininum values such that the whole group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered highest number to lowest (20 before 10). The secondary sort is based on the alphabetical comparison of the name of the object.  (v1.bar before v1.foo) We&#39;d recommend something like: <code>*</code>.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to be in the 2000s
   */
  public APIServiceSpec groupPriorityMinimum(Long groupPriorityMinimum) {
    this.groupPriorityMinimum = groupPriorityMinimum;
    return this;
  }

  /**
   * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this server. This is strongly discouraged.  You should use the CABundle instead.
   */
  public APIServiceSpec insecureSkipTLSVerify(Boolean insecureSkipTLSVerify) {
    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
    return this;
  }

  public APIServiceSpec service(ServiceReference service) {
    this.service = service;
    return this;
  }

  /**
   * Version is the API version this server hosts.  For example, &#34;v1&#34;
   */
  public APIServiceSpec version(String version) {
    this.version = version;
    return this;
  }

  /**
   * VersionPriority controls the ordering of this API version inside of its group.  Must be greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest (20 before 10). Since it&#39;s inside of a group, the number can be small, probably in the 10s. In case of equal version priorities, the version string will be used to compute the order inside a group. If the version string is &#34;kube-like&#34;, it will sort above non &#34;kube-like&#34; version strings, which are ordered lexicographically. &#34;Kube-like&#34; versions start with a &#34;v&#34;, then are followed by a number (the major version), then optionally the string &#34;alpha&#34; or &#34;beta&#34; and another number (the minor version). These are sorted first by GA &#62; beta &#62; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
   */
  public APIServiceSpec versionPriority(Long versionPriority) {
    this.versionPriority = versionPriority;
    return this;
  }
}
