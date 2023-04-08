
package io.k8s.api.core.v1;



/**
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 * 
 */
public class Probe {

    /**
     * ExecAction describes a "run in container" action.
     * 
     */
    public ExecAction exec;
    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    public Integer failureThreshold;
    public GRPCAction grpc;
    /**
     * HTTPGetAction describes an action based on HTTP Get requests.
     * 
     */
    public HTTPGetAction httpGet;
    /**
     * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Integer initialDelaySeconds;
    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    public Integer periodSeconds;
    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
     * 
     */
    public Integer successThreshold;
    /**
     * TCPSocketAction describes an action based on opening a socket
     * 
     */
    public TCPSocketAction tcpSocket;
    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod's terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is a beta field and requires enabling ProbeTerminationGracePeriod feature gate. Minimum value is 1. spec.terminationGracePeriodSeconds is used if unset.
     * 
     */
    public Integer terminationGracePeriodSeconds;
    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Integer timeoutSeconds;

    public Probe withExec(ExecAction exec) {
        this.exec = exec;
        return this;
    }

    public Probe withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    public Probe withGrpc(GRPCAction grpc) {
        this.grpc = grpc;
        return this;
    }

    public Probe withHttpGet(HTTPGetAction httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public Probe withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    public Probe withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    public Probe withSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    public Probe withTcpSocket(TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    public Probe withTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }

    public Probe withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

}
