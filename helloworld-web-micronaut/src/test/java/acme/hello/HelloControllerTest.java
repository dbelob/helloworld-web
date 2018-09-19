package acme.hello;

import io.micronaut.context.ApplicationContext;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.Assert;
import org.junit.Test;

public class HelloControllerTest {
    @Test
    public void serverTest() {
        EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer.class);
        HttpClient client = HttpClient.create(embeddedServer.getURL());

        Assert.assertEquals("Hello, World!", client.toBlocking().retrieve(HttpRequest.GET("/")));
    }
}