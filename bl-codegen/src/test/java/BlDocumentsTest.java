import io.vacco.beleth.xform.*;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlDocumentsTest {
  static {
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true");
  }
  static {
    it("Read JSON and YAML documents as trees", () -> {
      var dio = new BlDocuments();
      var k8sSwagger = dio.schemasOfSwagger(BlDocumentsTest.class.getResource("/k8s-swagger.json"));
      var crdList0 = dio.schemasOfCrd(BlDocumentsTest.class.getResource("/crd-podmonitors.yaml"));

      assertFalse(k8sSwagger.isEmpty());
      assertFalse(crdList0.isEmpty());

      var ctx = new BlSchemaContext();

      ctx.update(crdList0);
      ctx.update(k8sSwagger);

      var tCtx = new BlJavaContext();

      tCtx.mapTypes(ctx.schemaIdx.values());
    });
  }
}
