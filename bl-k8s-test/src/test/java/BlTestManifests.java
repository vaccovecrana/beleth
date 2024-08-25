import io.k8s.api.core.v1.Namespace;
import io.k8s.api.core.v1.ServiceAccount;
import io.k8s.api.rbac.v1.ClusterRole;

import java.util.List;

import static io.k8s.api.core.v1.Namespace.namespace;
import static io.k8s.api.core.v1.ServiceAccount.serviceAccount;
import static io.k8s.api.rbac.v1.ClusterRole.clusterRole;
import static io.k8s.api.rbac.v1.PolicyRule.policyRule;
import static io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta.objectMeta;
import static io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta.Labels.labels;

public class BlTestManifests {

  public static final String ns = "gopher-test";

  public static final Namespace nameSpace = namespace()
    .apiVersion("v1")
    .kind("Namespace")
    .metadata(
      objectMeta()
        .name(ns)
        .labels(labels().kv("name", ns))
    );

  public static final ServiceAccount serviceAccount = serviceAccount()
    .apiVersion("v1")
    .kind("ServiceAccount")
    .metadata(
      objectMeta()
        .name("momo-account")
        .namespace("kube-system")
        .labels(labels().kv("k8s-app", "momo-server"))
    );

  public static final ClusterRole clusterRoleAggregatedMetricsReader = clusterRole()
    .apiVersion("rbac.authorization.k8s.io/v1")
    .kind("ClusterRole")
    .metadata(
      objectMeta()
        .name("momo-metrics-reader")
        .labels(labels().kv("k8s-app", "momo-server"))
    )
    .rules(List.of(
      policyRule()
        .apiGroups(List.of("metrics.k8s.io"))
        .resources(List.of("pods", "nodes"))
        .verbs(List.of("get", "list", "watch"))
    ));

  public static final ClusterRole clusterRoleMetricsServer = clusterRole()
    .apiVersion("rbac.authorization.k8s.io/v1")
    .kind("ClusterRole")
    .metadata(
      objectMeta()
        .name("momo-metrics-server")
        .labels(labels().kv("k8s-app", "momo-server"))
    )
    .rules(List.of(
      policyRule()
        .apiGroups(List.of(""))
        .resources(List.of("nodes/metrics"))
        .verbs(List.of("get")),
      policyRule()
        .apiGroups(List.of(""))
        .resources(List.of("pods", "nodes"))
        .verbs(List.of("get", "list", "watch"))
    ));

}
