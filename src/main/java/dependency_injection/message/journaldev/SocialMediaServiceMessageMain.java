package dependency_injection.message.journaldev;

public class SocialMediaServiceMessageMain {
    public static void main(String[] args) {
        String messengerRec = "Captain America";
        String messengerMsg = "Sup bro?";
        String twittRec = "molk99";
        String twittMsg = "WYL grab some beer tonight?";

        SocialMediaServiceInjector injector= new MessengerInjector();
        Executor app = injector.execute();
        app.performMethodSend(messengerMsg, messengerRec);
        app.performMethodSend(twittMsg, twittRec);
    }
}
