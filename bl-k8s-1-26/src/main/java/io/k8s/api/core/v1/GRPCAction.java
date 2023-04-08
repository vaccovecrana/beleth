
package io.k8s.api.core.v1;


public class GRPCAction {

    /**
     * Port number of the gRPC service. Number must be in the range 1 to 65535.
     * (Required)
     * 
     */
    public Integer port;
    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    public String service;

    public GRPCAction withPort(Integer port) {
        this.port = port;
        return this;
    }

    public GRPCAction withService(String service) {
        this.service = service;
        return this;
    }

}
