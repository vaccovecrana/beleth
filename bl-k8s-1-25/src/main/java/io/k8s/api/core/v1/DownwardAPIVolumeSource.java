
package io.k8s.api.core.v1;

import java.util.List;


/**
 * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
 * 
 */
public class DownwardAPIVolumeSource {

    /**
     * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Integer defaultMode;
    /**
     * Items is a list of downward API volume file
     * 
     */
    public List<DownwardAPIVolumeFile> items;

    public DownwardAPIVolumeSource withDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    public DownwardAPIVolumeSource withItems(List<DownwardAPIVolumeFile> items) {
        this.items = items;
        return this;
    }

}
