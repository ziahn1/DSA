package practicePackage.Algo;


// Approach
//  str1 = str1+str2
// str2 = (str1+str2)-str2 = str1
// str1 = (str1+str2)-(str2 which is str1 now) = str2

public class SwapTwoStringWithoutUsingThirdVariable {
    public static String swap(String s1, String s2){
        s1=s1+s2;
        s2= s1.substring(0,(s1.length()-s2.length()));
        s1=s1.substring(s2.length());

        return "After swapping s1= "+s1 +" and "+"s2= "+s2;
    }

    public static void main(String[] args) {
        System.out.println(swap("Helloooooooo", "World"));
    }
}
