
package io.k8s.apimachinery.pkg.apis.meta.v1;

import java.util.LinkedHashMap;


/**
 * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
 * 
 */
public class MatchLabels
    extends LinkedHashMap<String, String>
{


}
