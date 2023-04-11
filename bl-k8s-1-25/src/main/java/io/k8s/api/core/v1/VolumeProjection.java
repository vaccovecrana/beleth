package io.k8s.api.core.v1;

/**
 * Projection that may be projected along with other supported volume types
 */
public class VolumeProjection {
  public ConfigMapProjection configMap;

  public DownwardAPIProjection downwardAPI;

  public SecretProjection secret;

  public ServiceAccountTokenProjection serviceAccountToken;

  public VolumeProjection configMap(ConfigMapProjection configMap) {
    this.configMap = configMap;
    return this;
  }

  public VolumeProjection downwardAPI(DownwardAPIProjection downwardAPI) {
    this.downwardAPI = downwardAPI;
    return this;
  }

  public VolumeProjection secret(SecretProjection secret) {
    this.secret = secret;
    return this;
  }

  public VolumeProjection serviceAccountToken(ServiceAccountTokenProjection serviceAccountToken) {
    this.serviceAccountToken = serviceAccountToken;
    return this;
  }
}
