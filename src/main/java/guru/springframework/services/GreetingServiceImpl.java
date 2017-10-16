package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Service implementation
 * @author Pallab Banerjee
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello!!!!!!!!!";
    
  }

}
