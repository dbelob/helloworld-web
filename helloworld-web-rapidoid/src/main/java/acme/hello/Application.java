package acme.hello;

import org.rapidoid.setup.On;
import org.rapidoid.u.U;

public class Application {
    public static void main(String[] args) {
        // This starts a HTTP server on port 8080 and defines a handler for the route GET /
        On.get("/").json(() -> U.map("msg", "Hello, World!"));
    }
}
