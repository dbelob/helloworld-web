package acme.hello.model;

/**
 * Model class that stores a message.
 */
public class MessageStore {
    private String message;

    public MessageStore() {
        message = "Struts";
    }

    public String getMessage() {
        return message;
    }
}
