import com.google.gson.*;

import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.util.List;

import static j8spec.J8Spec.*;

import static io.k8s.api.core.v1.ConfigMap.*;
import static io.k8s.api.core.v1.Container.*;
import static io.k8s.api.core.v1.ContainerPort.*;
import static io.k8s.api.core.v1.configmap.Data.data;
import static io.k8s.api.core.v1.Namespace.*;
import static io.k8s.api.core.v1.Pod.*;
import static io.k8s.api.core.v1.PodTemplateSpec.*;
import static io.k8s.api.core.v1.PodSecurityContext.*;
import static io.k8s.api.core.v1.PodSpec.*;
import static io.k8s.api.core.v1.ResourceRequirements.*;

import static io.k8s.api.apps.v1.Deployment.*;
import static io.k8s.api.apps.v1.DeploymentSpec.*;

import static io.k8s.apimachinery.pkg.apis.meta.v1.labelselector.MatchLabels.matchLabels;
import static io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta.Labels.labels;
import static io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta.*;
import static io.k8s.apimachinery.pkg.apis.meta.v1.LabelSelector.*;

import static io.k8s.api.core.v1.resourcerequirements.Limits.*;
import static io.k8s.api.core.v1.resourcerequirements.Requests.*;

@RunWith(J8SpecRunner.class)
public class BlObjectTest {

  private static final Gson g = new GsonBuilder().setPrettyPrinting().create();

  static {
    it("Instantiates/serializes core K8s objects", () -> {
      var dep = deployment()
        .apiVersion("apps/v1")
        .kind("Deployment")
        .metadata(
          objectMeta()
            .name("web-server")
            .namespace("web")
        ).spec(
          deploymentSpec()
            .replicas(3L)
            .selector(
              labelSelector()
                .matchLabels(
                  matchLabels().kv("foo", "bar")
                )
            ).template(
              podTemplateSpec()
                .metadata(
                  objectMeta().labels(labels().kv("name", "prometheus")))
                .spec(
                  podSpec()
                    .containers(List.of(
                      container()
                        .image("prom/prometheus")
                        .name("prometheus")
                        .ports(List.of(containerPort().containerPort(9090L).name("api")))
                    ))
                )
            )
        );

      var reqs = requests().kv("memory", "64Mi").kv("cpu", "250m");
      var lims = limits().kv("memory", "128Mi").kv("cpu", "500m");

      var pod = pod()
        .apiVersion("v1")
        .kind("Pod")
        .metadata(objectMeta().name("frontend"))
        .spec(
          podSpec().containers(List.of(
            container()
              .name("app")
              .image("images.my-company.example/app:v4")
              .imagePullPolicy("IfNotPresent")
              .resources(
                resourceRequirements()
                  .requests(reqs)
                  .limits(lims)
              ),
            container()
              .name("log-aggregator")
              .image("images.my-company.example/log-aggregator:v6")
              .resources(
                resourceRequirements()
                  .requests(reqs)
                  .limits(lims)
              )
          )).securityContext(podSecurityContext().fsGroup(1001L))
        );

      var cm = configMap()
        .apiVersion("v1")
        .data(data().kv("start-master.sh", "SOME_STRING_FROM_FILE"));

      var ns = namespace()
        .apiVersion("v1")
        .kind("Namespace")
        .metadata(objectMeta().name("gopher-infra"));

      var cfgMap = configMap()
        .apiVersion("v1")
        .kind("ConfigMap")
        .metadata(
          objectMeta()
            .creationTimestamp("2016-02-18T18:52:05Z")
            .name("game-config")
            .name("default")
            .resourceVersion("516")
            .uid("b4952dc3-d670-11e5-8cd0-68f728db1985")
        ).data(
          data()
            .kv("game.properties", String.join("\n",
              "enemies=aliens",
              "lives=3",
              "enemies.cheat=true",
              "enemies.cheat.level=noGoodRotten",
              "secret.code.passphrase=superSecretPassPhrase"))
            .kv("ui.properties", String.join("\n",
              "color.good=purple",
              "color.bad=yellow",
              "allow.textmode=true",
              "how.nice.to.look=fairlyNice"
            ))
        );

      System.out.println(g.toJson(List.of(ns, dep, pod, cm, cfgMap)));
    });
  }

}
