package dependency_injection.message.journaldev;

public class MessengerInjector implements SocialMediaServiceInjector {
    @Override
    public Executor execute() {
        return new Application(new MessengerService());
    }
}