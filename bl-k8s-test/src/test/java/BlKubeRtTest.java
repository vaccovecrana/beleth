import io.vacco.beleth.rt.BlKubeRt;
import io.vacco.shax.logging.ShOption;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;

import static io.vacco.beleth.util.BlHeadless.runLocal;
import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class BlKubeRtTest {

  static {
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_DEVMODE, "true");
    ShOption.setSysProp(ShOption.IO_VACCO_SHAX_LOGLEVEL, "debug");
  }

  static {
    it("Synchronizes resources with a cluster", () -> runLocal(() -> {
      var apiServer = "https://k8s.xio.vacco.li:6443";
      var token = "eyJhbGciOiJSUzI1NiIsImtpZCI6Iko3Y05nQlVFMG5nQXVDRG1TcGdZX1B2SjVzVElBR0x2aUJDc2RicDBZNVkifQ.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJrdWJlLXN5c3RlbSIsImt1YmVybmV0ZXMuaW8vc2VydmljZWFjY291bnQvc2VjcmV0Lm5hbWUiOiJjbHVzdGVyLWFkbWluLXNhLXRva2VuIiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZXJ2aWNlLWFjY291bnQubmFtZSI6ImNsdXN0ZXItYWRtaW4tc2EiLCJrdWJlcm5ldGVzLmlvL3NlcnZpY2VhY2NvdW50L3NlcnZpY2UtYWNjb3VudC51aWQiOiIwOTUwNjliNC0xYWE4LTRlYTEtODNiMy1mMzQ0MWZjMGRjYmYiLCJzdWIiOiJzeXN0ZW06c2VydmljZWFjY291bnQ6a3ViZS1zeXN0ZW06Y2x1c3Rlci1hZG1pbi1zYSJ9.VOsjfwve1XxVUuooLqX1ULDDLHn1Ofh-Hz8rZBIvU8uXKuxGYkUvQOPpLajRchEOwGEtj8JgDau1Kr_OH142J5l9-uvXx2T88BWwjnaTASslIAC-Wi_eCtaB4t00i4G58BsWMho8QqHm9shgK988gPw6U01t2xk1s695m8tdlwmYpGmu1FzHcf2wVDS49IVA1J0SC_DxbSN3rXjyio51aMkmXcVYHluZKMRZy1cS_xttO1qZULRMPOrV4QYQUryW7Hc9n4qq26eWsygFed6F9uVb8fchFcgz8cM0XkygtkUZQKN36vghgX2WzOp1sO1TuGXFNi02L-oCCHCt8hVt4gacNosAl3OYcP2gREj6qcBRNwdXcWvOXJUIVddf_fjNBJ_VxjCk4lZZIviwG-1OY9OrutCZ7f9f65YL8WPzJrlAoBbecm7oyIfqup2oJl8oJHNS3fjhhSIuD6blB2_JuzhI0FD_MGQyJWXdsGMMC8oT2x5hhDmaM1C0MxqQ6o-0--hkxq6K0xhPVO6SBq6-ETScGX1YsB2LqEf5VPUBXIP52hXhgAHa7r4pQJbt1VjgWdPSiRZJ5aXD4ILdEraO1YptQTMUIkuttBqM0WoiZ7xiMy4JVlqbeP4nhwPNOHoYl-DGCu6E9h-la-xhvaB4p_wQWz3-7BCDQTbIm4mGUE8";
      var rt = new BlKubeRt(apiServer, token);

      var add = false;
      if (add) {
        rt
          .add(BlTestManifests.nameSpace)
          .add(BlTestManifests.serviceAccount);
      }

      var pkg = "io.gopher.test";
      rt.commit(pkg);
    }));
  }
}
