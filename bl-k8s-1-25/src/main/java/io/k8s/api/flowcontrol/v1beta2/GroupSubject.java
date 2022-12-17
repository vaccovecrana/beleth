
package io.k8s.api.flowcontrol.v1beta2;



/**
 * GroupSubject holds detailed information for group-kind subject.
 * 
 */
public class GroupSubject {

    /**
     * name is the user group that matches, or "*" to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
     * (Required)
     * 
     */
    public String name;

    public GroupSubject withName(String name) {
        this.name = name;
        return this;
    }

}
