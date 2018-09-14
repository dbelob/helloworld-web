package hello.world;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloController {
    @Get
    public String index() {
        return "Hello World";
    }
}