package io.k8s.apimachinery.pkg.apis.meta.v1;

import io.k8s.apimachinery.pkg.runtime.RawExtension;
import java.lang.String;

/**
 * Event represents a single event to a watched resource.
 */
public class WatchEvent {
  public RawExtension object;

  public String type;

  public WatchEvent object(RawExtension object) {
    this.object = object;
    return this;
  }

  public WatchEvent type(String type) {
    this.type = type;
    return this;
  }

  public static WatchEvent watchEvent() {
    return new WatchEvent();
  }
}
