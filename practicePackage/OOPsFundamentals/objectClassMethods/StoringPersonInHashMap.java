package practicePackage.OOPsFundamentals.objectClassMethods;

import java.util.HashMap;
import java.util.Map;

public class StoringPersonInHashMap {
    public static void main(String[] args) {
        HashMap<Person,Integer> map = new HashMap<>();
        Person p1 = new Person(1234567, 26, "Zia");
        Person p2 = new Person(1234567, 26, "Zia");
        Person p3 = new Person(3456789, 26, "Maarif");
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
       System.out.println("hashcode of p1 " + p1.hashCode());
       System.out.println("hashcode of p2 "+p2.hashCode());
        
       
      Integer i = map.get(p1);
        System.out.println(map.keySet().size());
        System.out.println(i);
    }
}
