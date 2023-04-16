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

  public void jsonSchemaXForm(URL jsonUrl, File outDir, String rootPackage) {
    var schemas = docCtx.findJsonSchemas(jsonUrl, rootPackage);
    xForm(schemas, outDir);
  }

  public void jsonSchemaXForm(URL jsonUrl, File outDir) {
    var schemas = docCtx.findJsonSchemas(jsonUrl, null);
    xForm(schemas, outDir);
  }

  public void crdXForm(URL openApiCrdYaml, File outDir) {
    var schemas = docCtx.findCrdSchemas(openApiCrdYaml);
    xForm(schemas, outDir);
  }

}
