
package io.k8s.api.authentication.v1;

import java.util.List;


/**
 * UserInfo holds the information about the user needed to implement the user.Info interface.
 * 
 */
public class UserInfo {

    /**
     * Any additional information provided by the authenticator.
     * 
     */
    public Extra extra;
    /**
     * The names of groups this user is a part of.
     * 
     */
    public List<String> groups;
    /**
     * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
     * 
     */
    public String uid;
    /**
     * The name that uniquely identifies this user among all active users.
     * 
     */
    public String username;

    public UserInfo withExtra(Extra extra) {
        this.extra = extra;
        return this;
    }

    public UserInfo withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public UserInfo withUid(String uid) {
        this.uid = uid;
        return this;
    }

    public UserInfo withUsername(String username) {
        this.username = username;
        return this;
    }

}
