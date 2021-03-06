package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Value("${hello.message}")
    private String message;
    
    @Value("${hello.something}")
    private String something;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! - It is " + message + " " + something;
    }
    
}
