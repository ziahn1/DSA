package practicePackage.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class NaturalSortingInStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(1);

        list.stream().sorted().forEach(x->System.out.println(x));
    }
}
