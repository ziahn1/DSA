package practicePackage;

public class LengthOfLastWord {
    public static int findLength(String str){
       String s = str.trim();
       String[] s1=s.split(" ");
       int length = s1[s1.length-1].length();
        return length;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
          int length = findLength(s);
        System.out.println(length);
    }
}
