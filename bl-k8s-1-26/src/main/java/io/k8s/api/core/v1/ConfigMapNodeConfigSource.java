
package io.k8s.api.core.v1;



/**
 * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node. This API is deprecated since 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
 * 
 */
public class ConfigMapNodeConfigSource {

    /**
     * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
     * (Required)
     * 
     */
    public String kubeletConfigKey;
    /**
     * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
     * (Required)
     * 
     */
    public String name;
    /**
     * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
     * (Required)
     * 
     */
    public String namespace;
    /**
     * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
     * 
     */
    public String resourceVersion;
    /**
     * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
     * 
     */
    public String uid;

    public ConfigMapNodeConfigSource withKubeletConfigKey(String kubeletConfigKey) {
        this.kubeletConfigKey = kubeletConfigKey;
        return this;
    }

    public ConfigMapNodeConfigSource withName(String name) {
        this.name = name;
        return this;
    }

    public ConfigMapNodeConfigSource withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ConfigMapNodeConfigSource withResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ConfigMapNodeConfigSource withUid(String uid) {
        this.uid = uid;
        return this;
    }

}
