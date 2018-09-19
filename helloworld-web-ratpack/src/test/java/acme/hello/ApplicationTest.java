package acme.hello;

import org.junit.After;
import org.junit.Test;
import ratpack.test.MainClassApplicationUnderTest;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {
    private MainClassApplicationUnderTest appUnderTest = new MainClassApplicationUnderTest(Application.class);

    @After
    public void shutdown() {
        appUnderTest.close();
    }

    @Test
    public void staticTextTest() {
        assertEquals("Hello, World!",
                appUnderTest.getHttpClient().getText("/"));
    }

    @Test
    public void dynamicTextTest() {
        assertEquals("Hello, Ratpack!",
                appUnderTest.getHttpClient().getText("/Ratpack"));
    }
}