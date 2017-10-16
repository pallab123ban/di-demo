package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * This is a controller class
 * @author Pallab Banerjee
 *
 */
@Controller
public class MyController {

  public String getHello() {
    System.out.println("Hello!!!!!!!!");
    return "pallab";
  }
}
