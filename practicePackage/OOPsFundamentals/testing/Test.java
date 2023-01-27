package practicePackage.OOPsFundamentals.testing;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add( 2);
        list2.add(4);
        list1.add(56);

        list2.add(5);

        HashMap<ArrayList<Integer>,Integer> map = new HashMap<>();
        map.put(list1, 1);
        map.put(list2,2);

        

        System.out.println(map);
    }
}
