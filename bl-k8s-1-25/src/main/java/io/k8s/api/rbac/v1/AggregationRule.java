
package io.k8s.api.rbac.v1;

import java.util.List;
import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;


/**
 * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
 * 
 */
public class AggregationRule {

    /**
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added
     * 
     */
    public List<LabelSelector> clusterRoleSelectors;

    public AggregationRule withClusterRoleSelectors(List<LabelSelector> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
        return this;
    }

}
