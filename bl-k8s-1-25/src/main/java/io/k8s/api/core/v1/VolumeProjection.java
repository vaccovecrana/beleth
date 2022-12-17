
package io.k8s.api.core.v1;



/**
 * Projection that may be projected along with other supported volume types
 * 
 */
public class VolumeProjection {

    /**
     * Adapts a ConfigMap into a projected volume.
     * 
     * The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
     * 
     */
    public ConfigMapProjection configMap;
    /**
     * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
     * 
     */
    public DownwardAPIProjection downwardAPI;
    /**
     * Adapts a secret into a projected volume.
     * 
     * The contents of the target Secret's Data field will be presented in a projected volume as files using the keys in the Data field as the file names. Note that this is identical to a secret volume source without the default mode.
     * 
     */
    public SecretProjection secret;
    /**
     * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
     * 
     */
    public ServiceAccountTokenProjection serviceAccountToken;

    public VolumeProjection withConfigMap(ConfigMapProjection configMap) {
        this.configMap = configMap;
        return this;
    }

    public VolumeProjection withDownwardAPI(DownwardAPIProjection downwardAPI) {
        this.downwardAPI = downwardAPI;
        return this;
    }

    public VolumeProjection withSecret(SecretProjection secret) {
        this.secret = secret;
        return this;
    }

    public VolumeProjection withServiceAccountToken(ServiceAccountTokenProjection serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
        return this;
    }

}
