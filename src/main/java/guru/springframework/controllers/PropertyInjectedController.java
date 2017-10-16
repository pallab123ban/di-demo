package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import guru.springframework.services.GreetingServiceImpl;

/**
 * Property injected controller
 * @author Pallab Banerjee
 *
 */
@Controller
public class PropertyInjectedController {

  @Autowired
  private GreetingServiceImpl greetingService;
  
  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
