package payment.good;

/** Implémentation concrète : paiement par mobile. */
public class MobilePayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing mobile payment: " + amount + " CFA");
    }
}
