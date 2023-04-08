
package io.k8s.api.core.v1;

import java.util.LinkedHashMap;


/**
 * stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
 * 
 */
public class StringData
    extends LinkedHashMap<String, Object>
{


}
