package practicePackage.Algo;

public class CaseConverter {
    public static String convert(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sb.append((char)(s.charAt(i)-32));
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                sb.append((char)(s.charAt(i)+32));
            }
            else if(s.charAt(i)==' '){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(convert("ZIA haider Naqvi"));
    }
}
