package dependency_injection.journaldev;

public class TwitterService implements SocialMediaService{
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("[" + msg + "] sent by Twitter to: " + rec);
    }
}
