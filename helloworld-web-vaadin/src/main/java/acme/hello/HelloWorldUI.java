package acme.hello;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.Version;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;

import javax.servlet.annotation.WebServlet;

@Theme("valo")
@SuppressWarnings("serial")
public class HelloWorldUI extends UI {
    private int clickCounter = 0;
    private Label clickCounterLabel;

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = HelloWorldUI.class)
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSpacing(true);
        setContent(layout);

        layout.addComponent(new Label("<h1>Hello, World!</h1>", ContentMode.HTML));
        layout.addComponent(new Label("Vaadin " + Version.getFullVersion()));

        Button button = new Button("Click Me");
        button.addClickListener((Button.ClickListener) event -> {
            clickCounter++;
            clickCounterLabel.setValue("Clicks: " + clickCounter);
            Notification.show("Thank you for clicking.");
        });

        layout.addComponent(button);
        layout.addComponent(clickCounterLabel = new Label("Clicks: 0"));
    }

}
