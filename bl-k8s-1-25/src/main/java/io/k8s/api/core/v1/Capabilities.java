
package io.k8s.api.core.v1;

import java.util.List;


/**
 * Adds and removes POSIX capabilities from running containers.
 * 
 */
public class Capabilities {

    /**
     * Added capabilities
     * 
     */
    public List<String> add;
    /**
     * Removed capabilities
     * 
     */
    public List<String> drop;

    public Capabilities withAdd(List<String> add) {
        this.add = add;
        return this;
    }

    public Capabilities withDrop(List<String> drop) {
        this.drop = drop;
        return this;
    }

}
