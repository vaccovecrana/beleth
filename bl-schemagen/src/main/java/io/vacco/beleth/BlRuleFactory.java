package io.vacco.beleth;

import com.sun.codemodel.JDefinedClass;
import org.jsonschema2pojo.rules.Rule;
import org.jsonschema2pojo.rules.RuleFactory;

public class BlRuleFactory extends RuleFactory {
  @Override public Rule<JDefinedClass, JDefinedClass> getAdditionalPropertiesRule() {
    return new BlAdditionalPropertiesRule(this);
  }
}
