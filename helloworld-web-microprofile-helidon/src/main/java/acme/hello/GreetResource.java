package acme.hello;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * A simple JAX-RS resource to greet you. Examples:
 * <p>
 * Get default greeting message:
 * curl -X GET http://localhost:8080
 * <p>
 * Get greeting message for Joe:
 * curl -X GET http://localhost:8080/Joe
 * <p>
 * Change greeting
 * curl -X PUT http://localhost:8080/greeting/Hola
 * <p>
 * The message is returned as a JSON object.
 */
@Path("/")
@RequestScoped
public class GreetResource {

    /**
     * The greeting message.
     */
    private static String greeting = null;

    /**
     * Using constructor injection to get a configuration property.
     * By default this gets the value from META-INF/microprofile-config
     *
     * @param greetingConfig the configured greeting message
     */
    @Inject
    public GreetResource(@ConfigProperty(name = "app.greeting") final String greetingConfig) {
        if (this.greeting == null) {
            this.greeting = greetingConfig;
        }
    }

    /**
     * Return a wordly greeting message.
     *
     * @return {@link JsonObject}
     */
    @SuppressWarnings("checkstyle:designforextension")
    @Path("/")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getDefaultMessage() {
        String msg = String.format("%s, %s!", greeting, "world");

        JsonObject returnObject = Json.createObjectBuilder()
                .add("message", msg)
                .build();
        return returnObject;
    }

    /**
     * Return a greeting message using the name that was provided.
     *
     * @param name the name to greet
     * @return {@link JsonObject}
     */
    @SuppressWarnings("checkstyle:designforextension")
    @Path("/{name}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getMessage(@PathParam("name") final String name) {
        String msg = String.format("%s, %s!", greeting, name);

        JsonObject returnObject = Json.createObjectBuilder()
                .add("message", msg)
                .build();
        return returnObject;
    }

    /**
     * Set the greeting to use in future messages.
     *
     * @param newGreeting the new greeting message
     * @return {@link JsonObject}
     */
    @SuppressWarnings("checkstyle:designforextension")
    @Path("/greeting/{greeting}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject updateGreeting(@PathParam("greeting") final String newGreeting) {
        this.greeting = newGreeting;

        JsonObject returnObject = Json.createObjectBuilder()
                .add("greeting", this.greeting)
                .build();
        return returnObject;
    }
}