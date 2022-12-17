
package io.k8s.api.core.v1;

import java.util.List;


/**
 * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
 * 
 */
public class LimitRangeSpec {

    /**
     * Limits is the list of LimitRangeItem objects that are enforced.
     * (Required)
     * 
     */
    public List<LimitRangeItem> limits;

    public LimitRangeSpec withLimits(List<LimitRangeItem> limits) {
        this.limits = limits;
        return this;
    }

}
