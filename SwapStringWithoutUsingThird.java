

public class SwapStringWithoutUsingThird {
    
    static void swap(String s1, String s2){
       s1=s1.concat(s2);
       s2=s1.substring(0, s1.length()-s2.length());
       s1=s1.substring(s2.length());

       System.out.println("After swap");
       System.out.println(s1 +" "+ s2);
    }

    public static void main(String[] args) {
        String s1="zia";
        String s2="Haider";
        swap(s1, s2);
    }
}
