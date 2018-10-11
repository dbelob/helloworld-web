package acme.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class HelloResource {
    @GET
    @Produces("text/html")
    public String getHtml() {
        return "<h1>Hello, World!</h1>\n"
                + "<p>JAX-RS (Restlet)</p>";
    }

    @GET
    @Produces("text/plain")
    public String getPlain() {
        return "Hello, World!";
    }
}