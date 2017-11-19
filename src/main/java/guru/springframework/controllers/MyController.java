package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * This is a controller class
 * @author Pallab Banerjee
 *
 */
@Controller
public class MyController {
  private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getHello() {
    System.out.println("Hello!!!!!!!!");
    return greetingService.sayGreeting();
  }
}
