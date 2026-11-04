package payment.good;

/** Implémentation concrète : paiement par crypto. */
public class CryptoPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing crypto payment: " + amount + " CFA");
    }
}
