package io.vacco.beleth.gen;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.*;
import org.jsonschema2pojo.Schema;
import org.jsonschema2pojo.rules.*;
import java.util.*;

public class BlAdditionalPropertiesRule implements Rule<JDefinedClass, JDefinedClass> {

  private final RuleFactory ruleFactory;

  public BlAdditionalPropertiesRule(BlRuleFactory ruleFactory) {
    this.ruleFactory = Objects.requireNonNull(ruleFactory);
  }

  @Override
  public JDefinedClass apply(String nodeName, JsonNode node, JsonNode parent, JDefinedClass jclass, Schema schema) {
    if (node != null && node.isBoolean() && !node.asBoolean()) {
      return jclass;
    }
    if (node != null && node.size() != 0) {
      String pathToAdditionalProperties;
      if (schema.getId().getFragment() == null) {
        pathToAdditionalProperties = "#/additionalProperties";
      } else {
        pathToAdditionalProperties = "#" + schema.getId().getFragment() + "/additionalProperties";
      }
      var additionalPropertiesSchema = ruleFactory.getSchemaStore().create(schema, pathToAdditionalProperties, ruleFactory.getGenerationConfig().getRefFragmentPathDelimiters());
      var propertyType = ruleFactory.getSchemaRule().apply(nodeName + "Property", node, parent, jclass, additionalPropertiesSchema);
      additionalPropertiesSchema.setJavaTypeIfEmpty(propertyType);

      var lhType = jclass.owner().ref(LinkedHashMap.class);
      lhType = lhType.narrow(jclass.owner().ref(String.class), propertyType.boxify());
      jclass._extends(lhType);
    }

    return jclass;
  }
}
