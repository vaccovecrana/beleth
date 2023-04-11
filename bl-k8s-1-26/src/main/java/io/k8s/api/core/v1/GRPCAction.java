package io.k8s.api.core.v1;

import java.lang.Long;
import java.lang.String;

public class GRPCAction {
  public Long port;

  public String service;

  /**
   * Port number of the gRPC service. Number must be in the range 1 to 65535.
   */
  public GRPCAction port(Long port) {
    this.port = port;
    return this;
  }

  /**
   * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
   *
   * If this is not specified, the default behavior is defined by gRPC.
   */
  public GRPCAction service(String service) {
    this.service = service;
    return this;
  }
}
