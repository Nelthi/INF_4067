package payment.bad;

/**
 * MAUVAIS DESIGN : une seule classe gère tous les moyens de paiement.
 * - Ajouter un moyen de paiement oblige à MODIFIER cette classe (viole OCP).
 * - Elle dépend des détails de chaque moyen de paiement (viole DIP).
 * - Elle a plusieurs raisons de changer (viole SRP).
 */
public class PaymentProcessor {

    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("mobil_pay")) {
            System.out.println("Processing mobile payment: " + amount + " CFA");
            // Logique spécifique aux paiements mobiles
        } else if (paymentType.equals("credit_card")) {
            System.out.println("Processing credit card payment: " + amount + " CFA");
            // Logique spécifique aux cartes bancaires
        } else if (paymentType.equals("paypal")) {
            System.out.println("Processing PayPal payment: " + amount + " CFA");
            // Logique spécifique à PayPal
        } else if (paymentType.equals("crypto")) {
            System.out.println("Processing crypto payment: " + amount + " CFA");
            // Logique spécifique aux crypto-monnaies
        }
        // Type inconnu : rien ne se passe, l'erreur est silencieuse !
    }
}
