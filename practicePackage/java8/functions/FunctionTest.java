package practicePackage.java8.functions;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer,Integer> squareNumber = (a) -> a*a;

        System.out.println(squareNumber.apply(5));
    }
}
