import io.vacco.beleth.xform.*;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;
import java.net.URL;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlCodeGenTest {

  public static final File outDir = new File("./build/java-src");

  static {
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true");
    outDir.mkdirs();
  }

  static {
    it("Emits Java sources from JSON/YAML schema containers", () -> {
      var cg = new BlCodeGen();
      var yamlUrl = "https://github.com/cert-manager/cert-manager/releases/download/v1.11.0/cert-manager.crds.yaml";
      cg.crdXForm(new URL(yamlUrl), outDir);
      cg.crdXForm(BlCodeGenTest.class.getResource("/crd-alertmanagerconfigs.yaml"), outDir);
      cg.jsonSchemaXForm(BlCodeGenTest.class.getResource("/k8s-swagger.json"), outDir);
    });
    it("Emits Java sources for JSON schema allOf rules", () -> {
      var cg = new BlCodeGen();
      var jsonUrl = BlCodeGenTest.class.getResource("/allof-test.json");
      cg.jsonSchemaXForm(jsonUrl, outDir, "io.vacco.test");
    });
  }
}
