package acme.hello.pages;

import org.apache.tapestry5.dom.Document;
import org.apache.tapestry5.test.PageTester;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IndexTest {
    private PageTester tester;

    public IndexTest() {
        tester = new PageTester("acme.hello", "app", "src/main/webapp");
    }

    @Test
    public void loadingIndexTest() {
        Document document = tester.renderPage("Index");

        String markup = document.toString();
        assertTrue(markup.contains("Hello, World!"));
    }
}