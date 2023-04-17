package io.vacco.beleth.xform;

import com.google.gson.Gson;
import jakarta.json.*;
import org.slf4j.*;
import org.yaml.snakeyaml.*;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

import static io.vacco.beleth.xform.BlSchemas.*;
import static io.vacco.beleth.util.BlExceptions.*;
import static java.lang.String.format;

public class BlDocumentContext {

  public static final Logger log = LoggerFactory.getLogger(BlDocumentContext.class);

  public static final String
    pDefinitions = "/definitions",
    pSpecGroup = "/spec/group",
    pSpecNamesKind = "/spec/names/kind",
    pSpecVersions = "/spec/versions",
    pSchemaOpenApiV3Schema = "/schema/openAPIV3Schema";

  public static final int MaxYamlSize = 32 * 1024 * 1024;

  private final Yaml y;
  private final Gson g = new Gson();

  public BlDocumentContext() {
    var yamlCfg = new LoaderOptions();
    yamlCfg.setCodePointLimit(MaxYamlSize);
    this.y = new Yaml(yamlCfg);
  }

  public <T> T fromJson(String json, Class<T> type) {
    return g.fromJson(json, type);
  }

  public String toJson(Object o) {
    return g.toJson(o);
  }

  public String toYaml(Object o) {
    return y.dump(o);
  }

  public JsonObject loadTreeFromJson(URL json) {
    try {
      try (var jrd = Json.createReader(new InputStreamReader(json.openStream()))) {
        return jrd.read().asJsonObject();
      }
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

  @SuppressWarnings("rawtypes")
  private void sanitize(Map raw) {
    var keys = raw.keySet().toArray();
    for (var k : keys) {
      if (!(k instanceof String)) {
        if (log.isDebugEnabled()) {
          log.debug("Removing invalid map key: [{}]", k);
        }
        raw.remove(k);
      } else {
        var val = raw.get(k);
        if (val instanceof Map) {
          sanitize((Map<?, ?>) val);
        }
      }
    }
  }

  @SuppressWarnings("unchecked")
  public List<JsonObject> loadTreeFromYaml(URL yaml) {
    var out = new ArrayList<JsonObject>();
    try {
      try (var isr = new InputStreamReader(yaml.openStream())) {
        var all = y.loadAll(isr);
        all.forEach(obj -> {
          if (obj != null) {
            var raw = (Map<String, Object>) obj;
            sanitize(raw);
            out.add(Json.createObjectBuilder(raw).build());
          }
        });
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
    try {
      var crds = loadTreeFromYaml(yamlUrl);
      for (var crd : crds) {
        if (crd.containsKey(kKind) && crd.getString(kKind).equals(vCustomResourceDefinition)) {
          var name = ((JsonString) crd.getValue(pSpecNamesKind)).getString();
          var rootPkg = ((JsonString) crd.getValue(pSpecGroup)).getString();
          crd.getValue(pSpecVersions).asJsonArray().forEach(jv -> {
            var schema = jv.asJsonObject().getValue(pSchemaOpenApiV3Schema).asJsonObject();
            var ver = jv.asJsonObject().getString("name");
            var pkg = format("%s.%s", rootPkg, ver);
            out.add(new BlSchema().withName(pkg, name).withDocument(schema));
          });
        } else if (log.isDebugEnabled()) {
          log.debug("No CRD definitions found in document {}", yamlUrl);
        }
      }
    } catch (Exception e) {
      var rc = rootCauseOf(e);
      var isYamlError =
           rc instanceof org.yaml.snakeyaml.scanner.ScannerException
        || rc instanceof org.yaml.snakeyaml.parser.ParserException;
      if (!(isYamlError)) {
        if (log.isDebugEnabled()) {
          log.debug("Unable to find CRD schemas in document {}", yamlUrl, rc);
        } else {
          log.warn("Unable to find CRD schemas in document {}, {} - {}", yamlUrl, rc.getClass(), rc.getMessage());
        }
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
  public List<BlSchema> findJsonSchemas(URL jsonUrl, String rootPackage) {
    var out = new ArrayList<BlSchema>();
    try {
      var json = loadTreeFromJson(jsonUrl);
      if (json.containsKey(kProperties)) {
        var title = json.containsKey(kTitle) ? json.getString(kTitle) : "Schema";
        out.add(new BlSchema().withName(rootPackage, title).withDocument(json));
      }
      if (json.containsKey(kDefinitions)) {
        var schemaObj = json.getValue(pDefinitions).asJsonObject();
        for (var e : schemaObj.entrySet()) {
          if (!e.getKey().startsWith("io.k8s.apiextensions-apiserver")) {
            var fqn = e.getKey();
            fqn = rootPackage == null ? fqn : format("%s.%s", rootPackage, fqn);
            BlSchema schema = new BlSchema()
              .withName(fqn)
              .withDocument(e.getValue().asJsonObject());
            out.add(schema);
          }
        }
      } else if (log.isDebugEnabled()) {
        log.debug("No JSON schemas found in document {}", jsonUrl);
      }
    } catch (Exception e) {
      var rc = rootCauseOf(e);
      if (log.isDebugEnabled()) {
        log.debug("Unable to find JSON schemas in document {}", jsonUrl, rc);
      } else {
        log.warn("Unable to find JSON schemas in document {}, {} - {}", jsonUrl, rc.getClass(), rc.getMessage());
      }
    }
    return out;
  }

}
