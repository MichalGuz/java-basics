package dependency_injection.my;

public class Processor implements MessageProcessor{
   private Message message;

   public Processor(Message mess) {
       this.message = mess;
   }

   @Override
   public void process(String receiver, String text){
       this.message.send(receiver, text);
   }
}