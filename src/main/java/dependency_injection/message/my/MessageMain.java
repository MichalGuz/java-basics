package dependency_injection.message.my;

import equals.ProductForSell;

public class MessageMain {
    public static void main(String[] args) {
        String receiver = "Man@man.com";
        String text = "Hi Man!";
        String receiverSms = "696 679 777";
        String message = "Hi M!";

        EmailMessage emailMessage = new EmailMessage();
        Processor processor = new Processor(emailMessage);
        processor.process(receiver, text);
    }
}
