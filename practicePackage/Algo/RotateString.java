package practicePackage.Algo;

public class RotateString {
    public static String rotate(String s,int n){
        StringBuilder sb = new StringBuilder();
       for(int i=0;i<s.length();i++){
        char temp = (char)(s.charAt(i)+n);
        if(temp>'z'){
            char c  = (char)(((s.charAt(i))%s.charAt(i))+'a');
            sb.append(c);
        }
        else{
            sb.append((char)(s.charAt(i)+n));
        }
       }
       
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "xyz";
        String res = rotate(s, 1);
        System.out.println(res);
    }
}
