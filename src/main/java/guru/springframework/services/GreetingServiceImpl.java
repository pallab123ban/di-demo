package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Service implementation
 * @author Pallab Banerjee
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {
  private static final String HELLO_GURUS = "Hello Gurus!! - Original Greeting Service";
  @Override
  public String sayGreeting() {
    return HELLO_GURUS;
    
  }

}
