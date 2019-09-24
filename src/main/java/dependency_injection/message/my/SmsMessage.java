package dependency_injection.message.my;

public class SmsMessage implements Message{
    @Override
    public void send(String receiver, String text){
        System.out.println("Sms message " + text + "has been sent to " + receiver);
    }
}
