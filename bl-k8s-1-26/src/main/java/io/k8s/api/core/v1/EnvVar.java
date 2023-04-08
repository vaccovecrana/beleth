
package io.k8s.api.core.v1;



/**
 * EnvVar represents an environment variable present in a Container.
 * 
 */
public class EnvVar {

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * (Required)
     * 
     */
    public String name;
    /**
     * Variable references $(VAR_NAME) are expanded using the previously defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
     * 
     */
    public String value;
    /**
     * EnvVarSource represents a source for the value of an EnvVar.
     * 
     */
    public EnvVarSource valueFrom;

    public EnvVar withName(String name) {
        this.name = name;
        return this;
    }

    public EnvVar withValue(String value) {
        this.value = value;
        return this;
    }

    public EnvVar withValueFrom(EnvVarSource valueFrom) {
        this.valueFrom = valueFrom;
        return this;
    }

}
