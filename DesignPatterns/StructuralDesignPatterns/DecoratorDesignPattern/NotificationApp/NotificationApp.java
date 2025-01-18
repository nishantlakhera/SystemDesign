public class NotificationApp {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("Hello!");
        System.out.println("-------");

        // Add SMS functionality
        notifier = new SMSNotifier(notifier);
        notifier.send("Hello!");
        System.out.println("--------");

        // Add Push Notification functionality

        notifier = new PushNotifier(notifier);
        notifier.send("Hello!");
    }

}
