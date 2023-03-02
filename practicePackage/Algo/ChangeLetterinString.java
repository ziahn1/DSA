package practicePackage.Algo;

public class ChangeLetterinString {
    public static String changeString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ascii = (s.charAt(i)+2);
            if(ascii>'z'){
                sb.append((char)(ascii-'z'+'a'));
            }
            else{
                sb.append((char)ascii);
            }
                }


        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(changeString("abcxyz"));
    }
}
