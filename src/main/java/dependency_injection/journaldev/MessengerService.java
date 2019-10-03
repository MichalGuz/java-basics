package dependency_injection.journaldev;

public class MessengerService implements SocialMediaService{
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("[" + msg + "] sent by Messenger to: " + rec);
    }
}
