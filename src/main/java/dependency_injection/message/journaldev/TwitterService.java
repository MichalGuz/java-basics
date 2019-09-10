package dependency_injection.message.journaldev;

public class TwitterService implements SocialMediaService{
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("[" + msg + "] sent by Twitter to: " + rec);
    }
}
