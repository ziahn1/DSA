package practicePackage.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class MaxOfInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(1);

       System.out.println(list.stream().max((i1,i2)->i1.compareTo(i2)).get());
       
    }
}
