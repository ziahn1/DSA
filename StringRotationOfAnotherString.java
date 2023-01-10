

public class StringRotationOfAnotherString {
    public static boolean check(String s1, String s2){
          
        String res = s1+ s2;

        if(s1.length()==s2.length() && res.indexOf(s2)!=-1){
             return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 ="Amazon";
        String s2 = "azonAm";

       boolean res= check(s1, s2);
       System.out.println(res);
    }
}
