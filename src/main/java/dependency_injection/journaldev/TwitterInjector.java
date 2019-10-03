package dependency_injection.journaldev;

public class TwitterInjector implements SocialMediaServiceInjector {
        @Override
        public Executor execute(){
            return new Application(new TwitterService());
        }
}
