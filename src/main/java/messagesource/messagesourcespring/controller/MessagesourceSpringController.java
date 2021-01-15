package messagesource.messagesourcespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessagesourceSpringController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
