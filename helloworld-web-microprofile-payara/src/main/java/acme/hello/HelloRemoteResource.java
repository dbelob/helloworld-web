package acme.hello;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@RequestScoped
@Produces(MediaType.TEXT_PLAIN)
public class HelloRemoteResource {
    @GET
    public String hello() {
        return "Hello, World!";
    }
}