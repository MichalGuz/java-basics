package dependency_injection.journaldev;

public class MessengerInjector implements SocialMediaServiceInjector {
    @Override
    public Executor execute() {
        return new Application(new MessengerService());
    }
}