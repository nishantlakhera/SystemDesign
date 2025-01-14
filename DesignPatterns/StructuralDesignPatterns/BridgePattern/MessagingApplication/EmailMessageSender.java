//Concrete implementor
public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("'" + message + "' : This Message has been sent using EmailMessageSender");
    }
}
