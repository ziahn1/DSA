package practicePackage;

public class AllPalindromicSubstrings {
    public static void getAllSubStrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){

                    if (checkPalindrome(str.substring(i, j)))
                        System.out.println(str.substring(i, j));
                }
            }
        }

    public static boolean checkPalindrome(String s){
        int l=0,h=s.length()-1;
        while (l<h){
            if (s.charAt(l)!=s.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }

    public static void main(String[] args) {
           String str = "amrbabohagpqpuzri";
           getAllSubStrings(str);
    }
}
