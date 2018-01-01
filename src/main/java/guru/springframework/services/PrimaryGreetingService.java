package guru.springframework.services;

/**
 * @author palla
 */

public class PrimaryGreetingService implements GreetingService {


    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello!!! - Primary Greeting service";
    }
}
