import io.vacco.beleth.xform.*;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlK8sCodeGenTest {

  static {
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true");
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_LOGLEVEL, "debug");
  }

  static {
    it("Emits Java sources for K8S core definitions", () -> {
      var cg = new BlCodeGen();
      var k8sVersions = new String[] {
        "k8s125", "k8s126", "k8s127", "k8s130"
      };
      for (var k8sVer : k8sVersions) {
        var swagger = String.format("/%s-swagger.json", k8sVer);
        var outPath = String.format("../bl-%s/src/main/java", k8sVer);
        cg.jsonSchemaXForm(
          BlK8sCodeGenTest.class.getResource(swagger),
          new File(outPath)
        );
      }
    });
  }

}
