import io.k8s.api.core.v1.Namespace;
import io.k8s.api.core.v1.ServiceAccount;

import static io.k8s.api.core.v1.Namespace.namespace;
import static io.k8s.api.core.v1.ServiceAccount.serviceAccount;
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

}
