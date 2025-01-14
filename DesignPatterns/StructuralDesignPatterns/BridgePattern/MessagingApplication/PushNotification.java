public class PushNotification extends Message{
    public PushNotification(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(String message) {
        messageSender.sendMessage(message);
    }
}
