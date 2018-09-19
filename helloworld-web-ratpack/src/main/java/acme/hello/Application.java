package acme.hello;

import ratpack.server.RatpackServer;

public class Application {
    public static void main(String[] args) throws Exception {
        RatpackServer.start(server -> {
            server.serverConfig(serverConfig -> serverConfig
                    .port(8080));
            server.handlers(chain -> chain
                    .get(ctx -> ctx.render("Hello, World!"))
                    .get(":name", ctx -> ctx.render("Hello, " + ctx.getPathTokens().get("name") + "!")));
        });
    }
}