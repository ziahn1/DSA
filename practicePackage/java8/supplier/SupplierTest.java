package practicePackage.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;
//  Supplier is a Functional Interface which doesn't take any input but return one parameter and it has SAM get()

public class SupplierTest {
   public static void main(String[] args) {
    Supplier<Date> date = () -> new Date();

    System.out.println(date.get());
   }
}
