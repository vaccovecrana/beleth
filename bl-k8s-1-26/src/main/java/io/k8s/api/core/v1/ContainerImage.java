
package io.k8s.api.core.v1;

import java.util.List;


/**
 * Describe a container image
 * 
 */
public class ContainerImage {

    /**
     * Names by which this image is known. e.g. ["kubernetes.example/hyperkube:v1.0.7", "cloud-vendor.registry.example/cloud-vendor/hyperkube:v1.0.7"]
     * 
     */
    public List<String> names;
    /**
     * The size of the image in bytes.
     * 
     */
    public Integer sizeBytes;

    public ContainerImage withNames(List<String> names) {
        this.names = names;
        return this;
    }

    public ContainerImage withSizeBytes(Integer sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

}
