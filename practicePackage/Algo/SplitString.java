package practicePackage.Algo;

public class SplitString {

public static String split(String s){
   
   StringBuilder alphabetic = new StringBuilder();
   StringBuilder numerics = new StringBuilder();
   StringBuilder spc = new StringBuilder();
   
   for(int i=0;i<s.length();i++){
    if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z'){
        alphabetic.append(s.charAt(i));
    }
    else if(s.charAt(i)>='1' && s.charAt(i)<='9'){
        numerics.append(s.charAt(i));
    }
    else{
        spc.append(s.charAt(i));
    }
   }

   String result = (alphabetic+" "+numerics+" "+spc).toString();
    return result;
}


public static void main(String[] args) {
    String S = "**Docoding123456789everyday##";
    System.out.println(split(S));

}

}
