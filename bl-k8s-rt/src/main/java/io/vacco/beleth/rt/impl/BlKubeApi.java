package io.vacco.beleth.rt.impl;

import com.google.gson.*;
import io.vacco.beleth.rt.schema.*;
import io.vacco.beleth.xform.BlDocumentContext;
import org.slf4j.*;
import java.net.URI;
import java.net.http.*;
import java.util.*;

import static java.lang.String.format;
import static java.util.stream.Collectors.*;
import static java.util.Objects.requireNonNull;
import static com.google.gson.JsonParser.parseString;
import static io.vacco.beleth.rt.util.BlIo.*;
import static io.vacco.beleth.rt.util.BlResources.*;
import static io.vacco.beleth.rt.util.BlResourceTypes.internalTypes;
import static io.vacco.beleth.rt.impl.BlLogging.onError;
import static java.lang.Thread.sleep;

public class BlKubeApi {

  public static final int ResourcePollRetries = 10;
  public static final long ResourcePollWaitTimeMs = 250;

  private static final Logger log = LoggerFactory.getLogger(BlKubeApi.class);

  public final BlDocumentContext ctx;

  private final int         timeoutMs;
  private final HttpClient  client;
  private final String      apiToken;

  private final URI apiServerUri;
  private final Set<BlResourceType> clusterResourceTypes = new HashSet<>();

  public BlKubeApi(String apiServerUri, String apiToken, int timeoutMs) {
    this.timeoutMs = timeoutMs;
    this.apiServerUri = uri(requireNonNull(apiServerUri));
    this.apiToken = requireNonNull(apiToken);
    this.ctx = new BlDocumentContext();
    this.client = HttpClient
      .newBuilder()
      .sslContext(trustAllContext())
      .build();
  }

  private String load(URI target) {
    return doRequest(target, client, apiToken, GET, null, timeoutMs);
  }

  private void addResource(String apiPath, JsonElement resourceElement) {
    var resource = resourceElement.getAsJsonObject();
    var nameSpaced = resource.get("namespaced").getAsBoolean();
    var name = resource.get("name").getAsString();
    if (!name.contains("/") && !internalTypes.contains(name)) {
      this.clusterResourceTypes.add(BlResourceType.of(apiPath, name, nameSpaced));
    }
  }

  public void loadResourceTypes() {
    if (!this.clusterResourceTypes.isEmpty()) {
      return;
    }
    try {
      var content = load(uri(apiServerUri, "/apis"));
      var apis = parseString(content).getAsJsonObject();
      var groups = apis.getAsJsonArray("groups");

      for (var groupElement : groups) {
        var group = groupElement.getAsJsonObject();
        var groupName = group.get("name").getAsString();
        var versions = group.getAsJsonArray("versions");

        for (var versionElement : versions) {
          var version = versionElement.getAsJsonObject().get("version").getAsString();
          var resourceListUri = format("/apis/%s/%s", groupName, version);
          try {
            var resourceListContent = load(uri(apiServerUri, resourceListUri));
            var resourceList = parseString(resourceListContent).getAsJsonObject();
            var resources = resourceList.getAsJsonArray("resources");
            for (var resourceElement : resources) {
              addResource(resourceListUri, resourceElement);
            }
          } catch (Exception e) {
            onError(log, "Unable to load resource list [{}]", e, resourceListUri);
          }
        }
      }

      var coreApiContent = load(uri(apiServerUri, "/api/v1"));
      var coreApiResources = JsonParser.parseString(coreApiContent).getAsJsonObject();
      var coreResources = coreApiResources.getAsJsonArray("resources");
      var groupVersion = coreApiResources.get("groupVersion").getAsString();

      for (var resourceElement : coreResources) {
        var resource = resourceElement.getAsJsonObject();
        var apiPrefix = format("/api/%s/%s", groupVersion, resource.get("name").getAsString());
        addResource(apiPrefix, resourceElement);
      }
    } catch (Exception e) {
      throw new IllegalStateException("Unable to load resource types", e);
    }
  }

  private List<BlResource> extractResourcesFrom(String resourceListJson, String kind) {
    var idx = ctx.fromJson(resourceListJson, Map.class);
    if (idx != null) {
      var items = (List<?>) idx.get("items");
      if (items != null && !items.isEmpty()) {
        return items.stream()
          .filter(obj -> obj instanceof Map)
          .map(obj -> resourceOf(obj, null, null, kind))
          .collect(toList());
      }
    }
    return new ArrayList<>();
  }

  public String queryUrlFor(BlResourceType type, String packageName) {
    return String.format(
      "%s/%s?labelSelector=%s=%s%s",
      type.apiPath,
      type.apiPath.contains(type.name) ? "" : type.name,
      kBlPkg, packageName, type.nameSpaced ? "&all-namespaces=true" : ""
    );
  }

  public String createUrlFor(BlResourceType type, String namespace) {
    if (!type.nameSpaced) {
      if (type.apiPath.contains(type.name)) {
        return type.apiPath;
      }
      return String.format("%s/%s", type.apiPath, type.name);
    } else {
      return String.format(
        "%s/namespaces/%s/%s", type.apiPath.replace(type.name, ""),
        namespace, type.name
      ).replace("//", "/");
    }
  }

  public String updateUrlFor(BlResourceType type, String namespace, String resourceName) {
    if (!type.nameSpaced) {
      if (type.apiPath.contains(type.name)) {
        return format("%s/%s", type.apiPath, resourceName);
      }
      return String.format("%s/%s/%s", type.apiPath, type.name, resourceName);
    }  else {
      return String.format(
        "%s/namespaces/%s/%s/%s", type.apiPath.replace(type.name, ""),
        namespace, type.name, resourceName
      ).replace("//", "/");
    }
  }

  private BlResourceType resourceTypeOf(BlResource res) {
    return this.clusterResourceTypes.stream()
      .filter(rt -> rt.name.equals(res.getKind()))
      .findFirst()
      .orElseThrow();
  }

  public void pollReady(BlResource res) {
    var k = ResourcePollRetries;
    while (k > 0) {
      try {
        var url = queryUrlFor(resourceTypeOf(res), res.getPkg());
        var result = doRequestRaw(uri(apiServerUri, url), client, apiToken, GET, null, timeoutMs);
        if (isResponseOk(result)) {
          break;
        }
        sleep(ResourcePollWaitTimeMs);
      } catch (Exception e) {
        onError(log, "Unable to poll status on resource {}", e, res);
      }
      k--;
    }
  }

  public void create(BlResource res) {
    try {
      var url = createUrlFor(resourceTypeOf(res), res.getNameSpace());
      var body = ctx.toJson(res.manifest);
      var result = doRequest(uri(apiServerUri, url), client, apiToken, POST, body, timeoutMs);
      pollReady(res);
      log.info("{} [{}] {}", POST, url, result.trim());
    } catch (Exception e) {
      throw new IllegalStateException("Unable to create resource " + res, e);
    }
  }

  public void update(BlResource res) {
    try {
      var url = updateUrlFor(resourceTypeOf(res), res.getNameSpace(), res.getName());
      var body = ctx.toJson(res.manifest);
      var result = doRequest(uri(apiServerUri, url), client, apiToken, PUT, body, timeoutMs);
      pollReady(res);
      log.info("{} [{}] {}", PUT, url, result.trim());
    } catch (Exception e) {
      throw new IllegalStateException("Unable to update resource " + res, e);
    }
  }

  public void delete(BlResource res) {
    try {
      var url = updateUrlFor(resourceTypeOf(res), res.getNameSpace(), res.getName());
      var body = ctx.toJson(res.manifest);
      var result = doRequest(uri(apiServerUri, url), client, apiToken, DELETE, body, timeoutMs);
      log.info("{} [{}] {}", DELETE, url, result.trim());
    } catch (Exception e) {
      throw new IllegalStateException("Unable to delete resource " + res, e);
    }
  }

  public Map<String, List<BlResource>> resourceTypeIndex(String packageName) {
    this.loadResourceTypes();
    var idx = new LinkedHashMap<String, List<BlResource>>();
    for (var rType : clusterResourceTypes) {
      var queryUrl = queryUrlFor(rType, packageName);
      try {
        var resJson = load(uri(apiServerUri, queryUrl));
        var resList = extractResourcesFrom(resJson, rType.name);
        if (!resList.isEmpty()) {
          idx.computeIfAbsent(rType.name, k -> new ArrayList<>()).addAll(resList);
        }
      } catch (Exception e) {
        onError(log, "Unable to load resource list [{}]", e, rType);
      }
    }
    return idx;
  }

  public Set<BlResource> resourceSet(String packageName) {
    var rtIdx = this.resourceTypeIndex(packageName);
    var rtList = rtIdx.values().stream()
      .flatMap(Collection::stream)
      .filter(res -> res.id().contains(packageName))
      .collect(toList());
    return new HashSet<>(rtList);
  }

}
