package practicePackage.Algo;

public class FindSubString {
    public static int substringOccurence(String str,String sub){
        StringBuilder sb = new StringBuilder();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==sub.charAt(0)){
            for (int j = i; j < str.length(); j++) {
                    sb.append(str.charAt(j));
                    if(sub.equals(sb.toString())){
                        count++;
                    }
                }
                sb.setLength(0);  
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "pqabcytabcuiabxabc";
     System.out.println(substringOccurence(s, "abc"));
    }
}
