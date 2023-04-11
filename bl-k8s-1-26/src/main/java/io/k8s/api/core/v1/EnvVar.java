package io.k8s.api.core.v1;

import java.lang.String;

/**
 * EnvVar represents an environment variable present in a Container.
 */
public class EnvVar {
  public String name;

  public String value;

  public EnvVarSource valueFrom;

  /**
   * Name of the environment variable. Must be a C_IDENTIFIER.
   */
  public EnvVar name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. &#34;$$(VAR_NAME)&#34; will produce the string literal &#34;$(VAR_NAME)&#34;. Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;.
   */
  public EnvVar value(String value) {
    this.value = value;
    return this;
  }

  public EnvVar valueFrom(EnvVarSource valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }
}
