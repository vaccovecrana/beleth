
package io.k8s.api.core.v1;

import java.util.List;


/**
 * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
 * 
 */
public class DownwardAPIProjection {

    /**
     * Items is a list of DownwardAPIVolume file
     * 
     */
    public List<DownwardAPIVolumeFile> items;

    public DownwardAPIProjection withItems(List<DownwardAPIVolumeFile> items) {
        this.items = items;
        return this;
    }

}
