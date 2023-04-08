
package io.k8s.api.networking.v1;

import java.util.List;


/**
 * IngressSpec describes the Ingress the user wishes to exist.
 * 
 */
public class IngressSpec {

    /**
     * IngressBackend describes all endpoints for a given service and port.
     * 
     */
    public IngressBackend defaultBackend;
    /**
     * IngressClassName is the name of an IngressClass cluster resource. Ingress controller implementations use this field to know whether they should be serving this Ingress resource, by a transitive connection (controller -> IngressClass -> Ingress resource). Although the `kubernetes.io/ingress.class` annotation (simple constant name) was never formally defined, it was widely supported by Ingress controllers to create a direct binding between Ingress controller and Ingress resources. Newly created Ingress resources should prefer using the field. However, even though the annotation is officially deprecated, for backwards compatibility reasons, ingress controllers should still honor that annotation if present.
     * 
     */
    public String ingressClassName;
    /**
     * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
     */
    public List<IngressRule> rules;
    /**
     * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
     */
    public List<IngressTLS> tls;

    public IngressSpec withDefaultBackend(IngressBackend defaultBackend) {
        this.defaultBackend = defaultBackend;
        return this;
    }

    public IngressSpec withIngressClassName(String ingressClassName) {
        this.ingressClassName = ingressClassName;
        return this;
    }

    public IngressSpec withRules(List<IngressRule> rules) {
        this.rules = rules;
        return this;
    }

    public IngressSpec withTls(List<IngressTLS> tls) {
        this.tls = tls;
        return this;
    }

}
