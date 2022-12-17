
package io.k8s.api.authorization.v1;

import java.util.LinkedHashMap;
import java.util.List;


/**
 * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
 * 
 */
public class Extra
    extends LinkedHashMap<String, List<String>>
{


}
