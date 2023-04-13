package io.vacco.beleth.xform;

import jakarta.json.*;
import org.slf4j.*;
import org.yaml.snakeyaml.Yaml;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

import static io.vacco.beleth.xform.BlSchemas.*;
import static io.vacco.beleth.util.BlFormat.swapDash;

public class BlDocumentContext {

  public static final Logger log = LoggerFactory.getLogger(BlDocumentContext.class);

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
   * @param yamlUrl a Yaml document.
   * @return a list of JSON schemas contained within the document.
   */
  public List<BlSchema> findCrdSchemas(URL yamlUrl) {
    var out = new ArrayList<BlSchema>();
    var crds = loadJsonFromYaml(yamlUrl);
    for (var crd : crds) {
      if (crd.containsKey(kKind) && crd.getString(kKind).equals(vCustomResourceDefinition)) {
        var name = ((JsonString) crd.getValue(pSpecNamesKind)).getString();
        var rootPkg = ((JsonString) crd.getValue(pSpecGroup)).getString();
        crd.getValue(pSpecVersions).asJsonArray().forEach(jv -> {
          var schema = jv.asJsonObject().getValue(pSchemaOpenApiV3Schema).asJsonObject();
          var ver = jv.asJsonObject().getString("name");
          var pkg = swapDash(String.format("%s.%s", rootPkg, ver));
          out.add(new BlSchema().withName(pkg, name).withDocument(schema));
        });
      } else {
        log.info("No CRD definitions found on document {}", yamlUrl);
      }
    }
    return out;
  }

  /**
   * Scans a document for JSON schemas
   *
   * @param jsonUrl a JSON document.
   * @return a list of JSON schemas contained within the document.
   */
  public List<BlSchema> findJsonSchemas(URL jsonUrl, String ... packageParts) {
    var out = new ArrayList<BlSchema>();
    var json = loadJson(jsonUrl);
    if (json.containsKey(kProperties)) {
      var pkg = String.join(".", packageParts);
      out.add(new BlSchema().withName(pkg, ""));
    } else if (json.containsKey(kDefinitions)) {
      var schemaObj = json.getValue(pDefinitions).asJsonObject();
      for (var e : schemaObj.entrySet()) {
        if (!e.getKey().startsWith("io.k8s.apiextensions-apiserver")) {
          out.add(
            new BlSchema()
              .withName(swapDash(e.getKey()))
              .withDocument(e.getValue().asJsonObject())
          );
        }
      }
    } else {
      log.info("No JSON schemas found in document {}", jsonUrl);
    }
    return out;
  }

}
