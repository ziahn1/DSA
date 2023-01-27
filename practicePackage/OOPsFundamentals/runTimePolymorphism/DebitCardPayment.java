package practicePackage.OOPsFundamentals.runTimePolymorphism;

public class DebitCardPayment extends Payment{

    @Override
    public void makePayment() {
       System.out.println("Payment processing using Debit Card"); 
    }
    
}
