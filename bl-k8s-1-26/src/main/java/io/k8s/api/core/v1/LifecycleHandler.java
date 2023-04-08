
package io.k8s.api.core.v1;



/**
 * LifecycleHandler defines a specific action that should be taken in a lifecycle hook. One and only one of the fields, except TCPSocket must be specified.
 * 
 */
public class LifecycleHandler {

    /**
     * ExecAction describes a "run in container" action.
     * 
     */
    public ExecAction exec;
    /**
     * HTTPGetAction describes an action based on HTTP Get requests.
     * 
     */
    public HTTPGetAction httpGet;
    /**
     * TCPSocketAction describes an action based on opening a socket
     * 
     */
    public TCPSocketAction tcpSocket;

    public LifecycleHandler withExec(ExecAction exec) {
        this.exec = exec;
        return this;
    }

    public LifecycleHandler withHttpGet(HTTPGetAction httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public LifecycleHandler withTcpSocket(TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

}
