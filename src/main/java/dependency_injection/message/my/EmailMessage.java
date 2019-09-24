package dependency_injection.message.my;

public class EmailMessage implements Message{
    @Override
    public void send(String receiver, String text){
        System.out.println("Email " + text + " has been sent to " + receiver);
    }
}
