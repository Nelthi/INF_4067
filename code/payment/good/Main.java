package payment.good;

public class Main {
    public static void main(String[] args) {
        new PaymentProcessor(new MobilePayment()).processPayment(1500);
        new PaymentProcessor(new CreditCardPayment()).processPayment(6500);
        new PaymentProcessor(new PayPalPayment()).processPayment(4500);
        new PaymentProcessor(new CryptoPayment()).processPayment(8500);
    }
}
