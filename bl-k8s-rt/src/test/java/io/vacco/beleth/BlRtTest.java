package io.vacco.beleth;

import io.k8s.api.core.v1.*;
import io.k8s.apimachinery.pkg.apis.meta.v1.ObjectMeta;
import io.vacco.beleth.rt.BlKubeCtl;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static io.vacco.beleth.util.BlMaps.*;
import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlRtTest {
  static {
    it("Emits core K8S and Helm objects.", () -> {
      var kctl = new BlKubeCtl();

      var ns = new Namespace()
        .withApiVersion("v1")
        .withKind("Namespace")
        .withMetadata(
          new ObjectMeta().withName("gopher-infra")
        );
      System.out.println(kctl.render(ns));

      var cfgMap = new ConfigMap()
        .withApiVersion("v1")
        .withKind("ConfigMap")
        .withMetadata(
          new ObjectMeta()
            .withCreationTimestamp("2016-02-18T18:52:05Z")
            .withName("game-config")
            .withName("default")
            .withResourceVersion("516")
            .withUid("b4952dc3-d670-11e5-8cd0-68f728db1985")
        ).withData(
          map(new Data(),
            kv("game.properties", String.join("\n",
              "",
              "enemies=aliens",
              "lives=3",
              "enemies.cheat=true",
              "enemies.cheat.level=noGoodRotten",
              "secret.code.passphrase=UUDDLRLRBABAS"
            )),
            kv("ui.properties", String.join("\n",
              "",
              "color.good=purple",
              "color.bad=yellow",
              "allow.textmode=true",
              "how.nice.to.look=fairlyNice"
            ))
          )
        );
      System.out.println(kctl.render(cfgMap));
    });
  }
}
