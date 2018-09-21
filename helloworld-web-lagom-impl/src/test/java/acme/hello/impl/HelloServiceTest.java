package acme.hello.impl;

import acme.hello.api.HelloService;
import org.junit.Test;

import static com.lightbend.lagom.javadsl.testkit.ServiceTest.defaultSetup;
import static com.lightbend.lagom.javadsl.testkit.ServiceTest.withServer;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertEquals;

public class HelloServiceTest {
    @Test
    public void shouldStorePersonalizedGreeting() throws Exception {
        withServer(defaultSetup().withCassandra(), server -> {
            HelloService service = server.client(HelloService.class);

            String msg1 = service.hello("Alice").invoke().toCompletableFuture().get(5, SECONDS);
            assertEquals("Hello, Alice!", msg1); // default greeting
        });
    }
}
