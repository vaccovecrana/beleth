package io.vacco.beleth.gen;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.*;
import org.jsonschema2pojo.Schema;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.*;

public class BlPropertyRule extends PropertyRule {

  private final BlRuleFactory ruleFactory;

  public BlPropertyRule(BlRuleFactory ruleFactory) {
    super(ruleFactory);
    this.ruleFactory = ruleFactory;
  }

  @Override
  public JDefinedClass apply(String nodeName, JsonNode node, JsonNode parent, JDefinedClass jclass, Schema schema) {
    String pathToProperty;
    if (schema.getId() == null || schema.getId().getFragment() == null) {
      pathToProperty = "#/properties/" + nodeName;
    } else {
      pathToProperty = "#" + schema.getId().getFragment() + "/properties/" + nodeName;
    }
    if (pathToProperty.contains(".") && ruleFactory.getGenerationConfig().getSourceType() == SourceType.JSON) { // most likely Map<String, String>.
      return ruleFactory.extendLinkedHashMap(jclass, String.class, String.class);
    }
    try {
      return super.apply(nodeName, node, parent, jclass, schema);
    } catch (Exception e) {
      ruleFactory.getLogger().warn("Schema property processing error.", e);
      return jclass;
    }
  }
}
