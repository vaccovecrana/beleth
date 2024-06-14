import io.k8s.api.core.v1.Namespace;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import io.vacco.beleth.rt.*;
import io.vacco.beleth.util.BlHeadless;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import org.slf4j.*;

import static io.vacco.beleth.util.BlMaps.*;
import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlKubeCtlTest {

  static {
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true");
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_PRETTYPRINT, "true");
  }

  private static final Logger log = LoggerFactory.getLogger(BlKubeCtlTest.class);

  static {
    var ns = obj(
      kv("apiVersion", "v1"),
      kv("kind", "Namespace"),
      kv("metadata", obj(
        kv("name", "test-ns"),
        kv("annotations", obj(
          kv("foo", "bar")
        ))
      ))
    );

    var nsObj = new Namespace()
      .apiVersion("v1")
      .kind("Namespace")
      .metadata(new ObjectMeta().name("gopher-infra"));

    var k = new BlKubeRt();
    var kc = new BlKubeCtl();

    it("Creates a K8S resource", () -> BlHeadless.runOnDesktop(() -> {
      k.add(nsObj).add(ns).commit();
    }));
    it("Checks the status of a K8S resource", () -> BlHeadless.runOnDesktop(() -> {
      var diffTx = kc.isSynced(ns);
      log.info(diffTx.json);
      log.info(diffTx.result.getOutputString());
    }));
    it("Deletes a K8S resource", () -> BlHeadless.runOnDesktop(() -> {
      var syncTx = kc.sync(ns).withType("namespaces");
      if (syncTx.synced) {
        BlKubeUtil.pause(2500);
        var result = kc.delete(syncTx);
        log.info(result.getOutputString());
      }
    }));
  }
}
