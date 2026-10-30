
public class Main {
    public static void main(String[] args){
        paymentProcessor processor = new paymentProcessor();
        processor.paymentProcess("mobil_pay", 1500);
        processor.paymentProcess("credit_card", 6500);
        processor.paymentProcess("crypto", 8500);

    }
    
}
