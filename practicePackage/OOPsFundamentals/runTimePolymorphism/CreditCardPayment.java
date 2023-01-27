package practicePackage.OOPsFundamentals.runTimePolymorphism;

public class CreditCardPayment extends Payment{

    @Override
    public void makePayment() {
        System.out.println("Payment proceeding using Credit card");
        
    }
    
}
