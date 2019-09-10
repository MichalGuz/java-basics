package dependency_injection.message.journaldev;

public class Application implements Executor {
    private SocialMediaService socialMediaService;

    public Application(SocialMediaService serv){
        this.socialMediaService = serv;
    }
    @Override
    public void performMethodSend(String msg, String rec){
        this.socialMediaService.sendMessage(msg, rec);
    }
}
