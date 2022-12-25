package io.vacco.beleth.rt;

import io.k8s.api.core.v1.Namespace;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;

public class BlK8s {

  public static Namespace namespace(String name) {
    var ns = new Namespace();
    return ns
      .withApiVersion("v1")
      .withKind("Namespace")
      .withMetadata(
        new ObjectMeta()
          .withName(name)
      );
  }

}
