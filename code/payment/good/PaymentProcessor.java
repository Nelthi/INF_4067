package payment.good;

/**
 * Dépend uniquement de l'abstraction PaymentMethod (DIP) et reçoit son
 * implémentation par injection. Ajouter un moyen de paiement = ajouter une
 * classe, sans toucher à celle-ci (OCP).
 */
public class PaymentProcessor {
    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
