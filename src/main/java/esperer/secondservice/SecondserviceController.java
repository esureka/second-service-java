package esperer.secondservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
public class SecondserviceController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to a Second Service";
    }
}
