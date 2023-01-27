package practicePackage.OOPsFundamentals.callByValue;

public class CallingStrings {
    
    public static void dealingWithString(String s1,String s2){

        System.out.println("reference inside dealingWithString "+s1.hashCode());
        s1=s1+s2;

        System.out.println(s1);
    }
     public static void main(String[] args) {
        String s1="zia";
        String s2="Haider";
        System.out.println("refernce inside main "+s1.hashCode());
      dealingWithString(s1, s2);
     System.out.println();
     System.out.println("Original "+s1); 
    }
}
