
public class Main {
    public static void main(String[] args){
        paymentMethode creditCard = new creditCard();
        creditCard.paymentProcess(1500);

        paymentMethode mobileMoney = new mobilPay();
        mobileMoney.paymentProcess(21500);
        
    }
    
}
