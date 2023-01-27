package practicePackage.OOPsFundamentals.runTimePolymorphism;

public class PaymentService {
    public void proceesPayment(Payment paymentMethod){
        paymentMethod.makePayment();
    }

    public static void main(String[] args) {
        PaymentService service= new PaymentService();
        
        service.proceesPayment(new DebitCardPayment());
        service.proceesPayment(new CreditCardPayment());
    }
}
