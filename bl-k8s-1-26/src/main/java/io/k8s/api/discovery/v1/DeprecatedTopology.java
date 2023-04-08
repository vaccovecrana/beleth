
package io.k8s.api.discovery.v1;

import java.util.LinkedHashMap;


/**
 * deprecatedTopology contains topology information part of the v1beta1 API. This field is deprecated, and will be removed when the v1beta1 API is removed (no sooner than kubernetes v1.24).  While this field can hold values, it is not writable through the v1 API, and any attempts to write to it will be silently ignored. Topology information can be found in the zone and nodeName fields instead.
 * 
 */
public class DeprecatedTopology
    extends LinkedHashMap<String, Object>
{


}
