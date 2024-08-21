package io.k8s.apimachinery.pkg.apis.meta.v1;

import com.google.gson.annotations.SerializedName;
import java.lang.Long;
import java.lang.String;

/**
 * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
 */
public class ListMeta {
  @SerializedName("continue")
  public String vContinue;

  public Long remainingItemCount;

  public String resourceVersion;

  public String selfLink;

  /**
   * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
   */
  public ListMeta vContinue(String vContinue) {
    this.vContinue = vContinue;
    return this;
  }

  /**
   * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is <code>*</code>estimating<code>*</code> the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
   */
  public ListMeta remainingItemCount(Long remainingItemCount) {
    this.remainingItemCount = remainingItemCount;
    return this;
  }

  /**
   * String that identifies the server&#39;s internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
   */
  public ListMeta resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  /**
   * Deprecated: selfLink is a legacy read-only field that is no longer populated by the system.
   */
  public ListMeta selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  public static ListMeta listMeta() {
    return new ListMeta();
  }
}
