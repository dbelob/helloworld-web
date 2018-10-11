package acme.hello;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HelloApplication extends Application {
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> rrcs = new HashSet<>();
        rrcs.add(HelloResource.class);
        return rrcs;
    }
}