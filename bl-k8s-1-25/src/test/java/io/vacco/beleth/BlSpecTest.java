package io.vacco.beleth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import io.k8s.api.apps.v1.*;
import io.k8s.api.core.v1.*;
import io.k8s.apimachinery.pkg.apis.meta.v1.*;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import java.util.List;

import static io.vacco.beleth.util.BlMaps.*;
import static j8spec.J8Spec.*;

@RunWith(J8SpecRunner.class)
public class BlSpecTest {

  private static final ObjectWriter ow = new ObjectMapper()
    .setSerializationInclusion(JsonInclude.Include.NON_NULL)
    .writerWithDefaultPrettyPrinter();

  static {
    it("Instantiates/serializes core K8s objects",  () -> {
      var ns = new Namespace()
        .withApiVersion("v1")
        .withKind("Namespace")
        .withMetadata(new ObjectMeta().withName("vacco-infra"));

      var dep = new Deployment()
        .withApiVersion("apps/v1")
        .withKind("Deployment")
        .withMetadata(
          new ObjectMeta()
            .withName("web-server")
            .withNamespace("web")
        ).withSpec(
          new DeploymentSpec()
            .withReplicas(3)
            .withSelector(
              new LabelSelector()
                .withMatchLabels(
                  map(new MatchLabels(),
                    kv("foo", "bar")
                  )
                )
            ).withTemplate(
              new PodTemplateSpec()
                .withMetadata(
                  new ObjectMeta().withLabels(
                    map(new Labels(), kv("name", "prometheus"))
                  )
                ).withSpec(
                  new PodSpec()
                    .withContainers(List.of(
                      new Container()
                        .withImage("prom/prometheus")
                        .withName("prometheus")
                        .withPorts(List.of(
                          new ContainerPort()
                            .withContainerPort(9090)
                            .withName("api")
                        ))
                    ))
                )
            )
        );

      var reqs = map(new Requests(),
        kv("memory", "64Mi"),
        kv("cpu", "250m")
      );

      var lims = map(new Limits(),
        kv("memory", "128Mi"),
        kv("cpu", "500m")
      );

      var pod = new Pod()
        .withApiVersion("v1")
        .withKind("Pod")
        .withMetadata(new ObjectMeta().withName("frontend"))
        .withSpec(
          new PodSpec().withContainers(List.of(
            new Container()
              .withName("app")
              .withImage("images.my-company.example/app:v4")
              .withImagePullPolicy(Container.ImagePullPolicy.IF_NOT_PRESENT)
              .withResources(
                new ResourceRequirements()
                  .withRequests(reqs)
                  .withLimits(lims)
              ),
            new Container()
              .withName("log-aggregator")
              .withImage("images.my-company.example/log-aggregator:v6")
              .withResources(
                new ResourceRequirements()
                  .withRequests(reqs)
                  .withLimits(lims)
              )
          )).withSecurityContext(
            new PodSecurityContext()
              .withFsGroup(1001)
          )
        );

      var cm = new ConfigMap()
        .withApiVersion("v1")
        .withData(map(new Data(),
          kv("start-master.sh", "SOME_STRING_FROM_FILE")
        ));


      System.out.println(ow.writeValueAsString(List.of(
        ns, dep, pod, cm
      )));
    });
  }

}
