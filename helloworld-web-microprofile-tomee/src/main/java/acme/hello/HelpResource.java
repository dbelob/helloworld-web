package acme.hello;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/")
public class HelpResource {
    @GET
    @Produces("text/plain")
    public String get() {
        return "Hello, World!";
    }
}