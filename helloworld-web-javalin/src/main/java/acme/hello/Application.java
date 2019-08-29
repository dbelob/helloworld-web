package acme.hello;

import io.javalin.Javalin;

import java.io.Serializable;

class Entity implements Serializable {
    private String field;

    public Entity(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8080);
        app.get("/", ctx -> ctx.result("Hello, World!"));
        app.get("/json", ctx -> ctx.json(new Entity("value")));
    }
}
