//Refined Abstraction
public class TextMessage extends Message{
    public TextMessage(MessageSender messageSender){
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.sendMessage(message);
    }

}
