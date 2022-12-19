package io.vacco.beleth;
/*
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import prometheus_operator.kube_prometheus.*;
import static j8spec.J8Spec.*;
import static io.vacco.beleth.util.BlMaps.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlHelmObjectTest {
  static {
    it("Uses generated helm resources to fill values", () -> {
      var vals = new Values()
        .withGrafana(
          new Grafana()
            .withEnabled(false)
        ).withPrometheus(
          new Prometheus__2()
            .withPrometheusSpec(
              new PrometheusSpec()
                .withStorageSpec(
                  map(new StorageSpec(),
                    kv("emptyDir",
                      obj(kv("medium", "Memory"))
                    )
                  )
                )
            )
        );
      System.out.println(
        new ObjectMapper()
          .setSerializationInclusion(JsonInclude.Include.NON_NULL)
          .writerWithDefaultPrettyPrinter()
          .writeValueAsString(vals)
      );
    });
  }
}
*/