package practicePackage.java8;

import java.util.function.BiConsumer;

public class TestBiConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (a,b)-> System.out.println(a+b);

        biConsumer.accept(2, 3);
    }
}
