package practicePackage.java8.stream;
import java.util.stream.Stream;

public class OfMethodInStream {
    public static void main(String[] args) {
       Stream.of("a","abc","dfa").forEach(x->System.out.println(x));

       Stream.of(1,34,56,78,9,3,45,1,56,3,4,89).sorted((i1,i2)->i1.compareTo(i2)).forEach(x->System.out.println(x));

       Stream.of(56,4,3,89,0,1,-2,67).sorted((i1,i2)->i2.compareTo(i1)).forEach(x->System.out.println(x));

       System.out.println("min");
      System.out.println(Stream.of(3,8,5,9,2,6,4,19,2,-1).min((i1,i2)->i1.compareTo(i2)).get());

      System.out.println("max");
      System.out.println(Stream.of(3,8,5,6,4).max((i1,i2)->i1.compareTo(i2)).get());
    }
}
