
package io.k8s.api.storage.v1;



/**
 * VolumeError captures an error encountered during a volume operation.
 * 
 */
public class VolumeError {

    /**
     * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
     * 
     */
    public String message;
    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     * 
     */
    public String time;

    public VolumeError withMessage(String message) {
        this.message = message;
        return this;
    }

    public VolumeError withTime(String time) {
        this.time = time;
        return this;
    }

}
