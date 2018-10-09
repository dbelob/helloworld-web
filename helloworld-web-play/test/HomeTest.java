import org.junit.Test;
import play.test.WithBrowser;

import static org.junit.Assert.assertTrue;

public class HomeTest extends WithBrowser {
    @Test
    public void test() {
        browser.goTo("http://localhost:" + play.api.test.Helpers.testServerPort());
        assertTrue(browser.pageSource().contains("Hello, World!"));
    }
}