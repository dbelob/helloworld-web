package acme.hello;

import org.restlet.Context;
import org.restlet.ext.jaxrs.JaxRsApplication;

public class HelloJaxRsApplication extends JaxRsApplication {
    public HelloJaxRsApplication(Context context) {
        super(context);

        add(new HelloApplication());
    }
}