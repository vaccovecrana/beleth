package io.vacco.beleth.xform;

import java.io.File;
import java.net.URL;
import java.util.List;

public class BlCodeGen {

  private final BlDocumentContext docCtx = new BlDocumentContext();

  private void xForm(List<BlSchema> schemas, File outDir) {
    var schemaCtx = new BlSchemaContext();
    var javaCtx = new BlJavaContext();
    schemaCtx.update(schemas);
    javaCtx.update(schemaCtx.schemaIdx.values());
    javaCtx.export(outDir);
  }

  public void swaggerXForm(URL jsonUrl, File outDir) {
    var schemas = docCtx.schemasOfSwagger(jsonUrl);
    xForm(schemas, outDir);
  }

  public void openApiCrdXForm(URL openApiCrdYaml, File outDir) {
    var schemas = docCtx.schemasOfCrd(openApiCrdYaml);
    xForm(schemas, outDir);
  }

}
