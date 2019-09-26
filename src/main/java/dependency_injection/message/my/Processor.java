package dependency_injection.message.my;

public class Processor implements MessageProcessor{
   private Message message;

   public Processor(Message mess) {
       this.message = mess;
   }
}
