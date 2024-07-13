package io.k8s.api.storage.v1;

import io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import java.lang.String;

/**
 * CSIStorageCapacity stores the result of one CSI GetCapacity call. For a given StorageClass, this describes the available capacity in a particular topology segment.  This can be used when considering where to instantiate new PersistentVolumes.
 *
 * For example this can express things like: - StorageClass &#34;standard&#34; has &#34;1234 GiB&#34; available in &#34;topology.kubernetes.io/zone=us-east1&#34; - StorageClass &#34;localssd&#34; has &#34;10 GiB&#34; available in &#34;kubernetes.io/hostname=knode-abc123&#34;
 *
 * The following three cases all imply that no capacity is available for a certain combination: - no object exists with suitable topology and storage class name - such an object exists, but the capacity is unset - such an object exists, but the capacity is zero
 *
 * The producer of these objects can decide which approach is more suitable.
 *
 * They are consumed by the kube-scheduler when a CSI driver opts into capacity-aware scheduling with CSIDriverSpec.StorageCapacity. The scheduler compares the MaximumVolumeSize against the requested size of pending volumes to filter out unsuitable nodes. If MaximumVolumeSize is unset, it falls back to a comparison against the less precise Capacity. If that is also unset, the scheduler assumes that capacity is insufficient and tries some other node.
 */
public class CSIStorageCapacity {
  public String apiVersion;

  public String capacity;

  public String kind;

  public String maximumVolumeSize;

  public ObjectMeta metadata;

  public LabelSelector nodeTopology;

  public String storageClassName;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   */
  public CSIStorageCapacity apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.
   *
   * The serialization format is:
   *
   * ``` &#60;quantity&#62;        ::= &#60;signedNumber&#62;&#60;suffix&#62;
   *
   * 	(Note that &#60;suffix&#62; may be empty, from the &#34;&#34; case in &#60;decimalSI&#62;.)
   *
   * &#60;digit&#62;           ::= 0 | 1 | ... | 9 &#60;digits&#62;          ::= &#60;digit&#62; | &#60;digit&#62;&#60;digits&#62; &#60;number&#62;          ::= &#60;digits&#62; | &#60;digits&#62;.&#60;digits&#62; | &#60;digits&#62;. | .&#60;digits&#62; &#60;sign&#62;            ::= &#34;+&#34; | &#34;-&#34; &#60;signedNumber&#62;    ::= &#60;number&#62; | &#60;sign&#62;&#60;number&#62; &#60;suffix&#62;          ::= &#60;binarySI&#62; | &#60;decimalExponent&#62; | &#60;decimalSI&#62; &#60;binarySI&#62;        ::= Ki | Mi | Gi | Ti | Pi | Ei
   *
   * 	(International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)
   *
   * &#60;decimalSI&#62;       ::= m | &#34;&#34; | k | M | G | T | P | E
   *
   * 	(Note that 1024 = 1Ki but 1000 = 1k; I didn&#39;t choose the capitalization.)
   *
   * &#60;decimalExponent&#62; ::= &#34;e&#34; &#60;signedNumber&#62; | &#34;E&#34; &#60;signedNumber&#62; ```
   *
   * No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.
   *
   * When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.
   *
   * Before serializing, Quantity will be put in &#34;canonical form&#34;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:
   *
   * - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.
   *
   * The sign will be omitted unless the number is negative.
   *
   * Examples:
   *
   * - 1.5 will be serialized as &#34;1500m&#34; - 1.5Gi will be serialized as &#34;1536Mi&#34;
   *
   * Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.
   *
   * Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)
   *
   * This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   */
  public CSIStorageCapacity capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   */
  public CSIStorageCapacity kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.
   *
   * The serialization format is:
   *
   * ``` &#60;quantity&#62;        ::= &#60;signedNumber&#62;&#60;suffix&#62;
   *
   * 	(Note that &#60;suffix&#62; may be empty, from the &#34;&#34; case in &#60;decimalSI&#62;.)
   *
   * &#60;digit&#62;           ::= 0 | 1 | ... | 9 &#60;digits&#62;          ::= &#60;digit&#62; | &#60;digit&#62;&#60;digits&#62; &#60;number&#62;          ::= &#60;digits&#62; | &#60;digits&#62;.&#60;digits&#62; | &#60;digits&#62;. | .&#60;digits&#62; &#60;sign&#62;            ::= &#34;+&#34; | &#34;-&#34; &#60;signedNumber&#62;    ::= &#60;number&#62; | &#60;sign&#62;&#60;number&#62; &#60;suffix&#62;          ::= &#60;binarySI&#62; | &#60;decimalExponent&#62; | &#60;decimalSI&#62; &#60;binarySI&#62;        ::= Ki | Mi | Gi | Ti | Pi | Ei
   *
   * 	(International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)
   *
   * &#60;decimalSI&#62;       ::= m | &#34;&#34; | k | M | G | T | P | E
   *
   * 	(Note that 1024 = 1Ki but 1000 = 1k; I didn&#39;t choose the capitalization.)
   *
   * &#60;decimalExponent&#62; ::= &#34;e&#34; &#60;signedNumber&#62; | &#34;E&#34; &#60;signedNumber&#62; ```
   *
   * No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.
   *
   * When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.
   *
   * Before serializing, Quantity will be put in &#34;canonical form&#34;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:
   *
   * - No precision is lost - No fractional digits will be emitted - The exponent (or suffix) is as large as possible.
   *
   * The sign will be omitted unless the number is negative.
   *
   * Examples:
   *
   * - 1.5 will be serialized as &#34;1500m&#34; - 1.5Gi will be serialized as &#34;1536Mi&#34;
   *
   * Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.
   *
   * Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)
   *
   * This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   */
  public CSIStorageCapacity maximumVolumeSize(String maximumVolumeSize) {
    this.maximumVolumeSize = maximumVolumeSize;
    return this;
  }

  public CSIStorageCapacity metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  public CSIStorageCapacity nodeTopology(LabelSelector nodeTopology) {
    this.nodeTopology = nodeTopology;
    return this;
  }

  /**
   * The name of the StorageClass that the reported capacity applies to. It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
   */
  public CSIStorageCapacity storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

  public static CSIStorageCapacity cSIStorageCapacity() {
    return new CSIStorageCapacity();
  }
}
