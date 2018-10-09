package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.*;

//import views.html.*;  
/**
 *
 * @author myfear
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message. The
     * configuration in the <code>routes</code> file means that this method will
     * be called when the application receives a <code>GET</code> request with a
     * path of <code>/</code>.
     *
     * @return
     */
    public Result index() {
        return ok("It works!");
    }

    /**
     *
     * @return
     */
    @BodyParser.Of(BodyParser.Json.class)
    public Result sayHello() {
        JsonNode json = request().body().asJson();
        String name = json.findPath("name").textValue();
        if (name == null) {
            return badRequest("Missing parameter [name]");
        } else {
            return ok("Hello " + name);
        }
    }

}
