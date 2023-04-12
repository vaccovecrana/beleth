package io.vacco.beleth.xform;

import jakarta.json.*;
import org.yaml.snakeyaml.Yaml;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

import static io.vacco.beleth.util.BlFormat.swapDash;

public class BlDocumentContext {

  public static final String
    pDefinitions = "/definitions",
    pSpecGroup = "/spec/group",
    pSpecNamesKind = "/spec/names/kind",
    pSpecVersions = "/spec/versions",
    pSchemaOpenApiV3Schema = "/schema/openAPIV3Schema";

  private final Yaml y = new Yaml();

  public JsonObject loadJson(URL json) {
    try {
      try (var jrd = Json.createReader(new InputStreamReader(json.openStream()))) {
        return jrd.read().asJsonObject();
      }
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @SuppressWarnings("unchecked")
  public List<JsonObject> loadJsonFromYaml(URL yaml) {
    var out = new ArrayList<JsonObject>();
    try {
      try (var isr = new InputStreamReader(yaml.openStream())) {
        var all = y.loadAll(isr);
        all.forEach(obj -> out.add(
          Json.createObjectBuilder((Map<String, Object>) obj).build()
        ));
      }
      return out;
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   * Scans a Yaml document with CustomResourceDefinition for JSON schemas.
   *
   * @param crdYamlUrl an OpenAPI Yaml document.
   * @return a list of JSON schemas contained within the document.
   */
  public List<BlSchema> schemasOfCrd(URL crdYamlUrl) {
    var out = new ArrayList<BlSchema>();
    var crds = loadJsonFromYaml(crdYamlUrl);
    for (var crd : crds) {
      var name = ((JsonString) crd.getValue(pSpecNamesKind)).getString();
      var rootPkg = ((JsonString) crd.getValue(pSpecGroup)).getString();
      crd.getValue(pSpecVersions).asJsonArray().forEach(jv -> {
        var schema = jv.asJsonObject().getValue(pSchemaOpenApiV3Schema).asJsonObject();
        var ver = jv.asJsonObject().getString("name");
        var pkg = swapDash(String.format("%s.%s", rootPkg, ver));
        out.add(new BlSchema().withName(pkg, name).withDocument(schema));
      });
    }
    return out;
  }

  /**
   * Scans a Swagger document for JSON schemas
   *
   * @param swaggerJsonUrl a Swagger document in JSON format.
   * @return a list of JSON schemas contained within the document.
   */
  public List<BlSchema> schemasOfSwagger(URL swaggerJsonUrl) {
    var out = new ArrayList<BlSchema>();
    var swagger = loadJson(swaggerJsonUrl);
    var schemaObj = swagger.getValue(pDefinitions).asJsonObject();
    for (var e : schemaObj.entrySet()) {
      if (!e.getKey().startsWith("io.k8s.apiextensions-apiserver")) {
        out.add(
          new BlSchema()
            .withName(swapDash(e.getKey()))
            .withDocument(e.getValue().asJsonObject())
        );
      }
    }
    return out;
  }

}
