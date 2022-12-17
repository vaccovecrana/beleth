
package io.k8s.api.core.v1;

import java.util.LinkedHashMap;


/**
 * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
 * 
 */
public class BinaryData
    extends LinkedHashMap<String, String>
{


}
