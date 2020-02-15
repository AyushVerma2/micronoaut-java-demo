package micronoaut.java.demo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/message")
public class MessageController {

    @Get("/check")
    public String checkMessage() {
        return " this is first micronaut example";
    }

    @Get("/user")
    public String getUser() {
        return new User("Ayush", 1).toString();
    }
}