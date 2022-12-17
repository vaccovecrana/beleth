
package io.k8s.api.core.v1;



/**
 * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
 * 
 */
public class LimitRangeItem {

    /**
     * Default resource requirement limit value by resource name if resource limit is omitted.
     * 
     */
    public Default _default;
    /**
     * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
     * 
     */
    public DefaultRequest defaultRequest;
    /**
     * Max usage constraints on this kind by resource name.
     * 
     */
    public Max max;
    /**
     * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
     * 
     */
    public MaxLimitRequestRatio maxLimitRequestRatio;
    /**
     * Min usage constraints on this kind by resource name.
     * 
     */
    public Min min;
    /**
     * Type of resource that this limit applies to.
     * (Required)
     * 
     */
    public String type;

    public LimitRangeItem withDefault(Default _default) {
        this._default = _default;
        return this;
    }

    public LimitRangeItem withDefaultRequest(DefaultRequest defaultRequest) {
        this.defaultRequest = defaultRequest;
        return this;
    }

    public LimitRangeItem withMax(Max max) {
        this.max = max;
        return this;
    }

    public LimitRangeItem withMaxLimitRequestRatio(MaxLimitRequestRatio maxLimitRequestRatio) {
        this.maxLimitRequestRatio = maxLimitRequestRatio;
        return this;
    }

    public LimitRangeItem withMin(Min min) {
        this.min = min;
        return this;
    }

    public LimitRangeItem withType(String type) {
        this.type = type;
        return this;
    }

}
