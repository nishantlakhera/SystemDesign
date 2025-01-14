public class ECommerceApplication {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalApi());
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeApi());

        payPalProcessor.processPayment(100);
        stripeProcessor.processPayment(200);
    }
}
