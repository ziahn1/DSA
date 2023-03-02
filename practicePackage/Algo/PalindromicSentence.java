package practicePackage.Algo;

public class PalindromicSentence {
    public static boolean isPalindromice(String s){

        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
              sb.append(s.charAt(i));
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
               char lowercase = (char)(s.charAt(i)+32);
            }
            i++;
        }
         StringBuilder reverse  = sb.reverse();
           
         if(sb.toString().equals(reverse.toString())){
            return true;
         }

        return false;
    }

    public static void main(String[] args) {
      System.out.println(isPalindromice("A man, a plan, a canal: Panama"));
    }
}
