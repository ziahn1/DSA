package practicePackage.Algo;

public class FableWords {
    public static String reverse(String s){
        int i=0;
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)==' '){
              sb.reverse();
              result.append(sb);
              result.append(' ');
              sb.setLength(0);
              i++;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        sb.reverse();
        result.append(sb);
        
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Let's take Hackerrank contest"));
    }
}
