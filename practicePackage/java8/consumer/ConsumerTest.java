package practicePackage.java8.consumer;

import java.util.function.Consumer;
// Consumer is a functinal interface which takes only one input and returns nothing 
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = (s)-> System.out.println(s);

        consumer.accept("Zia");
    }
}
