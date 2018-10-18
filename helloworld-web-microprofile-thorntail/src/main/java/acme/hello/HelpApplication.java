package acme.hello;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class HelpApplication extends Application {
    public HelpApplication() {
    }
}