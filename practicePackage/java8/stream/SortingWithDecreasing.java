package practicePackage.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class SortingWithDecreasing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(1);

        list.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(x->System.out.println(x));
    }
}
