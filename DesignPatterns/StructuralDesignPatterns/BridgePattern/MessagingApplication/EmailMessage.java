//Refined Abstraction
public class EmailMessage extends Message{
    public EmailMessage(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(String message) {
        messageSender.sendMessage(message);
    }

}
