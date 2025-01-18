public class PushNotifier extends NotifierDecorator{
    public PushNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending push notification: "+message);
    }

}
