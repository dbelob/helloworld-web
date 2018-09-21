package acme.hello.api;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.transport.Method;

import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.restCall;

/**
 * The Hello service interface.
 * <p>
 * This describes everything that Lagom needs to know about how to serve and
 * consume the Hello.
 */
public interface HelloService extends Service {

    /**
     * Example: curl http://localhost:9000/Alice
     */
    ServiceCall<NotUsed, String> hello(String id);

    /**
     * Example: curl http://localhost:9000
     */
    ServiceCall<NotUsed, String> helloDefault();

    @Override
    default Descriptor descriptor() {
        return named("helloservice").withCalls(
                restCall(Method.GET, "/:id", this::hello),
                restCall(Method.GET, "/", this::helloDefault)
        ).withAutoAcl(true);
    }
}
