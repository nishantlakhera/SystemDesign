public class Example {
    public static void main(String[] args) {
        USPlug plug = new EuropeanToUSAdapter();
        plug.usePlug();
    }
}
