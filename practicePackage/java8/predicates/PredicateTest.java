package practicePackage.java8.predicates;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = s-> s.length()>=5;

        System.out.println(predicate.test("zia Haider"));
    }
}
