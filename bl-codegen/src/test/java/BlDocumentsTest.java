import io.vacco.beleth.xform.*;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlDocumentsTest {
  static {
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true");
  }
  static {
    it("Emits Java sources from JSON/YAML schema containers", () -> {
      var cg = new BlCodeGen();
      var outDir = new File("./build/java-src");
      outDir.mkdirs();
      cg.openApiCrdXForm(BlDocumentsTest.class.getResource("/crd-podmonitors.yaml"), outDir);
      cg.swaggerXForm(BlDocumentsTest.class.getResource("/k8s-swagger.json"), outDir);
    });
  }
}
