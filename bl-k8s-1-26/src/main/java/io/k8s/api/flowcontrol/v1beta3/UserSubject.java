
package io.k8s.api.flowcontrol.v1beta3;



/**
 * UserSubject holds detailed information for user-kind subject.
 * 
 */
public class UserSubject {

    /**
     * `name` is the username that matches, or "*" to match all usernames. Required.
     * (Required)
     * 
     */
    public String name;

    public UserSubject withName(String name) {
        this.name = name;
        return this;
    }

}
