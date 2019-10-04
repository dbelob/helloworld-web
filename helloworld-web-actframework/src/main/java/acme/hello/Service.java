package acme.hello;

import act.inject.DefaultValue;
import org.joda.time.DateTime;
import org.osgl.mvc.annotation.GetAction;

public class Service {

    /**
     * The hello (`/hello`) endpoint.
     * <p>
     * This will accept a query parameter named `who` and
     * return a greeting string in a form of "Hello $who"
     *
     * @param who request query parameter to specify the hello target.
     *            default value is `World`.
     * @return A hello string
     */
    @GetAction("hello")
    public String hello(@DefaultValue("World") String who) {
        return "Hello " + who;
    }

    /**
     * Returns an important date in history: 09/Mar/2016.
     * <p>
     * [AlphaGo](https://en.wikipedia.org/wiki/AlphaGo), a computer program defeated
     * [Lee Sedol](https://en.wikipedia.org/wiki/Lee_Sedol), one of the best human Go players
     * at this date.
     *
     * @return an important date in the history
     */
    @GetAction("date")
    public DateTime date() {
        return DateTime.parse("2016-03-09");
    }

    @GetAction("/")
    public String root() {
        return "Hello, World!";
    }
}
