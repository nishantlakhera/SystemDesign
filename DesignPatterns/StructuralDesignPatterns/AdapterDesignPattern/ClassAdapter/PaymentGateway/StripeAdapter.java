public class StripeAdapter implements PaymentProcessor{
    private StripeApi stripeApi;

    public StripeAdapter(StripeApi stripeApi){
        this.stripeApi = stripeApi;
    }

    @Override
    public void processPayment(double amount) {
        stripeApi.charge(amount);
    }
}
