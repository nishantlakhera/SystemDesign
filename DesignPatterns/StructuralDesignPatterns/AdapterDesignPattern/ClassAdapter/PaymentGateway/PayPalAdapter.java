// Adapter for PayPal
public class PayPalAdapter implements PaymentProcessor{
    private PayPalApi payPalApi;

    public PayPalAdapter(PayPalApi payPalApi){
        this.payPalApi = payPalApi;
    }

    @Override
    public void processPayment(double amount) {
        payPalApi.makePayment(amount);
    }
}
