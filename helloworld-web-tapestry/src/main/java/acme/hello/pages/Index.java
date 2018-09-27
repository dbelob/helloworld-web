package acme.hello.pages;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.Log;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.slf4j.Logger;

/**
 * Start page of application helloworld-web-tapestry.
 */
public class Index {
    @Inject
    private Logger logger;

    @Property
    @Inject
    @Symbol(SymbolConstants.TAPESTRY_VERSION)
    private String tapestryVersion;

    @Log
    void onComplete() {
        logger.info("Complete call on Index page");
    }
}