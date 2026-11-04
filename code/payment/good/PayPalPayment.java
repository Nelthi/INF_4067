package payment.good;

/** Implémentation concrète : paiement par PayPal. */
public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: " + amount + " CFA");
    }
}
