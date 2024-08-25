package io.vacco.beleth.rt.util;

import java.net.*;
import javax.net.ssl.*;
import java.net.http.*;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.lang.String.format;

public class BlIo {

  public static final String
    GET = "GET", PUT = "PUT",
    POST = "POST", DELETE = "DELETE";

  public static URI uri(String uri) {
    try {
      return new URI(uri);
    } catch (URISyntaxException e) {
      throw new IllegalArgumentException(e);
    }
  }

  public static URI uri(URI parent, String path) {
    return uri(parent + path);
  }

  public static SSLContext trustAllContext() {
    try {
      var sslContext = SSLContext.getInstance("TLS");
      sslContext.init(null, new TrustManager[] {
        new X509TrustManager() {
          public X509Certificate[] getAcceptedIssuers() { return null; }
          public void checkClientTrusted(X509Certificate[] certs, String authType) {}
          public void checkServerTrusted(X509Certificate[] certs, String authType) {}
        }
      }, new SecureRandom());
      return sslContext;
    } catch (Exception e) {
      throw new IllegalStateException("Unable to initialize trust-all SSL context", e);
    }
  }

  public static boolean isResponseOk(HttpResponse<?> response) {
    return response.statusCode() >= 200 && response.statusCode() <= 299;
  }

  public static HttpResponse<String> doRequestRaw(URI uri, HttpClient client,
                                                  String apiToken, String method,
                                                  String body, int timeoutMs) {
    try {
      var requestBuilder = HttpRequest.newBuilder()
        .uri(uri)
        .header("Authorization", "Bearer " + apiToken)
        .timeout(Duration.of(timeoutMs, ChronoUnit.MILLIS));

      switch (method.toUpperCase()) {
        case GET: requestBuilder.GET();break;
        case PUT: requestBuilder.PUT(HttpRequest.BodyPublishers.ofString(body)); break;
        case POST: requestBuilder.POST(HttpRequest.BodyPublishers.ofString(body)); break;
        case DELETE: requestBuilder.DELETE(); break;
        default:
          throw new IllegalArgumentException("Unsupported HTTP method: " + method);
      }

      return client.send(requestBuilder.build(), HttpResponse.BodyHandlers.ofString());
    } catch (Exception e) {
      throw new IllegalStateException(format(
        "Unable to execute raw request: [%s, %s]", method, uri
      ), e);
    }
  }

  public static String doRequest(URI uri, HttpClient client,
                                 String apiToken, String method,
                                 String body, int timeoutMs) {
    try {
      var response = doRequestRaw(uri, client, apiToken, method, body, timeoutMs);
      if (!isResponseOk(response)) {
        throw new IllegalStateException(format(
          "HTTP error [%d, %s]", response.statusCode(), response.body()
        ));
      }
      return response.body();
    } catch (Exception e) {
      throw new IllegalStateException(format(
        "Unable to execute request: [%s, %s]", method, uri
      ), e);
    }
  }

  @SuppressWarnings("rawtypes")
  public static Object pointerOnMap(Map root, String pointer) {
    var tokens = pointer.split("/");
    Object current = root;
    try {
      for (var token : tokens) {
        if (token.isEmpty()) continue;
        if (current instanceof Map) {
          @SuppressWarnings("unchecked")
          var currentMap = (Map<String, Object>) current;
          current = currentMap.get(token);
        } else if (current instanceof List) {
          int index = Integer.parseInt(token);
          var currentList = (List<?>) current;
          current = currentList.get(index);
        } else {
          return null; // path does not lead to a valid Map or List
        }
        if (current == null) {
          return null; // path doesn't exist
        }
      }
      return current;
    } catch (Exception e) {
      return null;
    }
  }

  public static Object pointerOnObject(Object root, String pointer) {
    var tokens = pointer.split("/");
    Object current = root;
    try {
      for (var token : tokens) {
        if (token.isEmpty()) continue;
        var field = current.getClass().getDeclaredField(token);
        field.setAccessible(true);
        current = field.get(current);
        if (current == null) {
          return null; // field doesn't exist
        }
      }
      return current;
    } catch (Exception e) {
      return null;
    }
  }

}
