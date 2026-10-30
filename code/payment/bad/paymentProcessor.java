public class paymentProcessor{
    public void paymentProcess(String paymentType, double amount){
        if(paymentType.equals("mobil_pay")){
            System.out.println("processing mobile payment : " + amount + " CFA");
            // Logique specifique aux payments mobiles
        }else if(paymentType.equals("credit_card")){
            System.out.println("processing credit card payment : " + amount + " CFA");
            // Logique specifique aux payments par carte de credit
        }else if(paymentType.equals("paypal")){
            System.out.println("processing paypal payment : " + amount + " CFA");
            // Logique specifique aux payments par paypal
        }else if(paymentType.equals("crypto")){
            System.out.println("processing credit crypto payment : " + amount + " CFA");
            // Logique specifique aux payments par crypto monaie
        }
    }
}
