
package io.k8s.api.apps.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import io.k8s.apimachinery.pkg.runtime.RawExtension;


/**
 * ControllerRevision implements an immutable snapshot of state data. Clients are responsible for serializing and deserializing the objects that contain their internal state. Once a ControllerRevision has been successfully created, it can not be updated. The API Server will fail validation of all requests that attempt to mutate the Data field. ControllerRevisions may, however, be deleted. Note that, due to its use by both the DaemonSet and StatefulSet controllers for update and rollback, this object is beta. However, it may be subject to name and representation changes in future releases, and clients should not depend on its stability. It is primarily for internal use by controllers.
 * 
 */
public class ControllerRevision {

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public String apiVersion;
    /**
     * RawExtension is used to hold extensions in external versions.
     * 
     * To use this, make a field which has RawExtension as its type in your external, versioned struct, and Object in your internal struct. You also need to register your various plugin types.
     * 
     * // Internal package:
     * 
     * 	type MyAPIObject struct {
     * 		runtime.TypeMeta `json:",inline"`
     * 		MyPlugin runtime.Object `json:"myPlugin"`
     * 	}
     * 
     * 	type PluginA struct {
     * 		AOption string `json:"aOption"`
     * 	}
     * 
     * // External package:
     * 
     * 	type MyAPIObject struct {
     * 		runtime.TypeMeta `json:",inline"`
     * 		MyPlugin runtime.RawExtension `json:"myPlugin"`
     * 	}
     * 
     * 	type PluginA struct {
     * 		AOption string `json:"aOption"`
     * 	}
     * 
     * // On the wire, the JSON will look something like this:
     * 
     * 	{
     * 		"kind":"MyAPIObject",
     * 		"apiVersion":"v1",
     * 		"myPlugin": {
     * 			"kind":"PluginA",
     * 			"aOption":"foo",
     * 		},
     * 	}
     * 
     * So what happens? Decode first uses json or yaml to unmarshal the serialized data into your external MyAPIObject. That causes the raw JSON to be stored, but not unpacked. The next step is to copy (using pkg/conversion) into the internal struct. The runtime package's DefaultScheme has conversion functions installed which will unpack the JSON stored in RawExtension, turning it into the correct object type, and storing it in the Object. (TODO: In the case where the object is of an unknown type, a runtime.Unknown object will be created and stored.)
     * 
     */
    public RawExtension data;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public String kind;
    /**
     * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
     * 
     */
    public ObjectMeta metadata;
    /**
     * Revision indicates the revision of the state represented by Data.
     * (Required)
     * 
     */
    public Integer revision;

    public ControllerRevision withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ControllerRevision withData(RawExtension data) {
        this.data = data;
        return this;
    }

    public ControllerRevision withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public ControllerRevision withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ControllerRevision withRevision(Integer revision) {
        this.revision = revision;
        return this;
    }

}
