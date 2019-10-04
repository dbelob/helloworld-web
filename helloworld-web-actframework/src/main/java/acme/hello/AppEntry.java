package acme.hello;

import act.Act;
import org.osgl.logging.LogManager;
import org.osgl.logging.Logger;
import osgl.version.Version;
import osgl.version.Versioned;

/**
 * A simple hello world service app entry
 * <p>
 * Run this app, try to update some of the code, then
 * press F5 in the browser to watch the immediate change
 * in the browser!
 */
@SuppressWarnings("unused")
@Versioned
public class AppEntry {

    /**
     * Version of this application
     */
    public static final Version VERSION = Version.of(AppEntry.class);

    /**
     * A logger instance that could be used through out the application
     */
    public static final Logger LOGGER = LogManager.get(AppEntry.class);

    public static void main(String[] args) throws Exception {
        Act.start();
    }
}
