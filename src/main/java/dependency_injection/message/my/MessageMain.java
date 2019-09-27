package dependency_injection.message.my;

public class MessageMain {
    public static void main(String[] args) {
        String receiver = "Man@man.com";
        String text = "Hi Man!";
        String receiverSms = "696 679 777";
        String message = "Hi M!";

        EmailMessage emailMessage = new EmailMessage();
        Processor processor = new Processor(emailMessage);
        processor.process(receiver, text);

        SmsMessage smsMessage = new SmsMessage();
        Processor processor1 = new Processor(smsMessage);
        processor1.process(receiverSms, message);
    }
}
