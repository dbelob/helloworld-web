package acme.hello;

import io.helidon.microprofile.server.Server;

import java.io.IOException;
import java.util.logging.LogManager;

/**
 * Main method simulating trigger of main method of the server.
 */
public final class Main {

    /**
     * Cannot be instantiated.
     */
    private Main() {
    }

    /**
     * Application main entry point.
     *
     * @param args command line arguments
     * @throws IOException if there are problems reading logging properties
     */
    public static void main(final String[] args) throws IOException {
        startServer();
    }

    /**
     * Start the server.
     *
     * @return the created {@link Server} instance
     * @throws IOException if there are problems reading logging properties
     */
    protected static Server startServer() throws IOException {

        // load logging configuration
        LogManager.getLogManager().readConfiguration(
                Main.class.getResourceAsStream("/logging.properties"));

        // Server will automatically pick up configuration from
        // microprofile-config.properties
        Server server = Server.create();
        server.start();
        return server;
    }
}