package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import guru.springframework.services.GreetingService;

/**
 * Property injected controller
 * @author Pallab Banerjee
 *
 */
@Controller
public class PropertyInjectedController {

  @Autowired
  private GreetingService greetingServiceImpl;
  
  public String sayHello() {
    return greetingServiceImpl.sayGreeting();
  }
}
