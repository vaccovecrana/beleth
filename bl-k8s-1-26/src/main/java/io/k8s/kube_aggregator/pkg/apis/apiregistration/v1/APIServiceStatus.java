
package io.k8s.kube_aggregator.pkg.apis.apiregistration.v1;

import java.util.List;


/**
 * APIServiceStatus contains derived information about an API server
 * 
 */
public class APIServiceStatus {

    /**
     * Current service state of apiService.
     * 
     */
    public List<APIServiceCondition> conditions;

    public APIServiceStatus withConditions(List<APIServiceCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

}
