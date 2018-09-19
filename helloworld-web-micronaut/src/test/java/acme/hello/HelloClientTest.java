package acme.hello;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Assert;
import org.junit.Test;

public class HelloClientTest {
    @Test
    public void clientTest() {
        EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer.class);
        HelloClient client = embeddedServer.getApplicationContext().getBean(HelloClient.class);

        Assert.assertEquals("Hello, World!", client.hello().blockingGet());
    }
}