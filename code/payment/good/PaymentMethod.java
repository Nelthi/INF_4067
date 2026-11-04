package payment.good;

/** Abstraction commune à tous les moyens de paiement (le « contrat »). */
public interface PaymentMethod {
    void processPayment(double amount);
}
