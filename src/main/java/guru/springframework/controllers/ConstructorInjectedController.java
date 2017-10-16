package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import guru.springframework.services.GreetingService;

/**
 * Constructor injected controller This works with or without @Autowire annotation. From Spring 4.2
 * onwards, Spring framework autowires constructor based injections automatically.
 * 
 * @author Pallab Banerjee
 *
 */
@Controller
public class ConstructorInjectedController {

  private GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    super();
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }

}
