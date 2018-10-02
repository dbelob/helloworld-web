package acme.hello.remote;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class HelloRemoteResource {

    @Path("{name}")
    @GET
    public String hello(@PathParam("name") String name) {
        return "Hello " + name + "!";
    }

}