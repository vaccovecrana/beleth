package io.k8s.api.batch.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.ListMeta;
import java.lang.String;
import java.util.List;

/**
 * JobList is a collection of jobs.
 */
public class JobList {
  public String apiVersion;

  public List<Job> items;

  public String kind;

  public ListMeta metadata;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public JobList apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * items is the list of Jobs.
   */
  public JobList items(List<Job> items) {
    this.items = items;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public JobList kind(String kind) {
    this.kind = kind;
    return this;
  }

  public JobList metadata(ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public static JobList jobList() {
    return new JobList();
  }
}
