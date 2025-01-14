public class MessagingApplicationDemo {
    public static void main(String[] args) {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send("Hello via Text...");

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send("Hello via Email..");

        MessageSender pushNotificationSender = new PushNotificationSender();
        Message pushNotification = new PushNotification(pushNotificationSender);
        pushNotification.send("Hello via push notification..");
    }
}
