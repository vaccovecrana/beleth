import io.vacco.beleth.util.BlArchive;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import java.io.File;
import java.net.URL;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlArchiveTest {

  public static File tarGzDir, build = new File("./build");

  static {
    it("Downloads and expands an archive file", () -> {
      var url = new URL("https://charts.bitnami.com/bitnami/airflow-14.0.16.tgz");
      tarGzDir = BlArchive.unpackTarGz(url, build);
    });
    it("Walks a file tree", () -> {
      BlArchive.scan(tarGzDir, ".json", ".yaml", ".yml")
        .forEach(f -> {
          System.out.println(f.getAbsolutePath());
        });
    });
  }
}
