
package io.k8s.api.core.v1;



/**
 * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil. This API is deprecated since 1.22
 * 
 */
public class NodeConfigSource {

    /**
     * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node. This API is deprecated since 1.22: https://git.k8s.io/enhancements/keps/sig-node/281-dynamic-kubelet-configuration
     * 
     */
    public ConfigMapNodeConfigSource configMap;

    public NodeConfigSource withConfigMap(ConfigMapNodeConfigSource configMap) {
        this.configMap = configMap;
        return this;
    }

}
