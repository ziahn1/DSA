package practicePackage.OOPsFundamentals.objectClassMethods;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        String s1="zia";
        String s2="zia";
        System.out.println(s1.equals(s2));

        Integer i =2;

        Character c = 'a';
        Long l =1L;
        Integer integer =2;
        Boolean flag1 = false;
        Boolean flag2 =false;
        System.out.println(integer.hashCode());
        System.out.println(l.hashCode());
        System.out.println(c.hashCode());
        System.out.println(flag1.hashCode());
        System.out.println(flag2.hashCode());
        
        Integer j =20;
        Integer k=20;
        System.out.println(k.hashCode());
        System.out.println(j.hashCode());
    }
}
