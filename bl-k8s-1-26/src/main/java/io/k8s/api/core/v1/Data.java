
package io.k8s.api.core.v1;

import java.util.LinkedHashMap;


/**
 * Data contains the configuration data. Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
 * 
 */
public class Data
    extends LinkedHashMap<String, Object>
{


}
