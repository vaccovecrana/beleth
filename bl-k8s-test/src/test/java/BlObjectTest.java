package io.vacco.beleth;

import com.google.gson.*;
import io.k8s.api.apps.v1.*;
import io.k8s.api.core.v1.*;
import io.k8s.api.core.v1.configmap.Data;
import io.k8s.api.core.v1.resourcerequirements.*;
import io.k8s.apimachinery.pkg.apis.meta.v1.*;
import io.k8s.apimachinery.pkg.apis.meta.v1.labelselector.MatchLabels;
import io.k8s.apimachinery.pkg.apis.meta.v1.objectmeta.Labels;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.util.List;

import static j8spec.J8Spec.*;

@RunWith(J8SpecRunner.class)
public class BlObjectTest {

  private static final Gson g = new GsonBuilder().setPrettyPrinting().create();

  static {
    it("Instantiates/serializes core K8s objects",  () -> {
      var dep = new Deployment()
        .apiVersion("apps/v1")
        .kind("Deployment")
        .metadata(
          new ObjectMeta()
            .name("web-server")
            .namespace("web")
        ).spec(
          new DeploymentSpec()
            .replicas(3L)
            .selector(
              new LabelSelector()
                .matchLabels(
                  new MatchLabels().kv("foo", "bar")
                )
            ).template(
              new PodTemplateSpec()
                .metadata(
                  new ObjectMeta().labels(new Labels().kv("name", "prometheus")))
                .spec(
                  new PodSpec()
                    .containers(List.of(
                      new Container()
                        .image("prom/prometheus")
                        .name("prometheus")
                        .ports(List.of(new ContainerPort().containerPort(9090L).name("api")))
                    ))
                )
            )
        );

      var reqs = new Requests()
        .kv("memory", "64Mi")
        .kv("cpu", "250m");

      var lims = new Limits()
        .kv("memory", "128Mi")
        .kv("cpu", "500m");

      var pod = new Pod()
        .apiVersion("v1")
        .kind("Pod")
        .metadata(new ObjectMeta().name("frontend"))
        .spec(
          new PodSpec().containers(List.of(
            new Container()
              .name("app")
              .image("images.my-company.example/app:v4")
              .imagePullPolicy("IfNotPresent")
              .resources(
                new ResourceRequirements()
                  .requests(reqs)
                  .limits(lims)
              ),
            new Container()
              .name("log-aggregator")
              .image("images.my-company.example/log-aggregator:v6")
              .resources(
                new ResourceRequirements()
                  .requests(reqs)
                  .limits(lims)
              )
          )).securityContext(new PodSecurityContext().fsGroup(1001L))
        );

      var cm = new ConfigMap()
        .apiVersion("v1")
        .data(new Data().kv("start-master.sh", "SOME_STRING_FROM_FILE"));

      var ns = new Namespace()
        .apiVersion("v1")
        .kind("Namespace")
        .metadata(new ObjectMeta().name("gopher-infra"));

      var cfgMap = new ConfigMap()
        .apiVersion("v1")
        .kind("ConfigMap")
        .metadata(
          new ObjectMeta()
            .creationTimestamp("2016-02-18T18:52:05Z")
            .name("game-config")
            .name("default")
            .resourceVersion("516")
            .uid("b4952dc3-d670-11e5-8cd0-68f728db1985")
        ).data(
          new Data()
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
