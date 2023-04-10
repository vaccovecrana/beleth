import io.vacco.beleth.xform.*;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlDocumentsTest {
  static {
    it("Read JSON and YAML documents as trees", () -> {
      var dio = new BlDocuments();
      var jt0 = dio.loadJson(BlDocumentsTest.class.getResource("/k8s-swagger.json"));
      var jt1 = dio.loadJsonFromYaml(BlDocumentsTest.class.getResource("/crd-podmonitors.yaml"));
      var jt2 = dio.loadJsonFromYaml(BlDocumentsTest.class.getResource("/values.yaml"));

      assertNotNull(jt0);
      assertFalse(jt1.isEmpty());
      assertFalse(jt2.isEmpty());

      var jt10 = jt1.get(0);

      var crdSchemas = dio.schemasOfCrd(jt10);
      var k8sSchemas = dio.schemasOfSwagger(jt0);

      var ctx = new BlSchemaContext();
      ctx.update(crdSchemas);
      ctx.update(k8sSchemas);

      var tCtx = new BlTypeContext();
      tCtx.map(ctx.schemaIdx.values());

      System.out.println();
    });
  }
}
