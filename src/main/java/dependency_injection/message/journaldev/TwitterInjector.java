package dependency_injection.message.journaldev;

public class TwitterInjector implements SocialMediaServiceInjector {
        @Override
        public Executor execute(){
            return new Application(new TwitterService());
        }
}
