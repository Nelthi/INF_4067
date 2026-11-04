package payment.good;

/** Implémentation concrète : paiement par credit card. */
public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount + " CFA");
    }
}
