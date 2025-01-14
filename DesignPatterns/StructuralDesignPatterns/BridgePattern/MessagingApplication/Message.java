//Abstraction
public abstract class Message {
    protected MessageSender messageSender;
    protected Message(MessageSender messageSender){
        this.messageSender = messageSender;
    }
    abstract public void send(String message);
}
