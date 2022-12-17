
package io.k8s.api.storage.v1;

import java.util.LinkedHashMap;


/**
 * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
 * 
 */
public class AttachmentMetadata
    extends LinkedHashMap<String, String>
{


}
