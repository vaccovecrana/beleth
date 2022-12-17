
package io.k8s.api.core.v1;

import java.util.LinkedHashMap;


/**
 * volumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.
 * 
 */
public class VolumeAttributes
    extends LinkedHashMap<String, String>
{


}
