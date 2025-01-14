public class PushNotificationSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("'" + message + "' : This Message has been sent using PushNotificationSender");
    }
}
