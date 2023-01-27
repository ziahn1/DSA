package practicePackage.Algo;

import java.util.HashMap;

public class ShuffleSentence {
    
    public static String shuffle(String s){
     
        int maxIndex=-1;
        int index=0;
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!Character.isAlphabetic(s.charAt(i)) && s.charAt(i)!=' '){
                maxIndex=Math.max(maxIndex, s.charAt(i)-'0');
            }
        }
        String[] arr = new String[maxIndex];
        for(int i=0;i<s.length();i++){
            if(!Character.isAlphabetic(s.charAt(i)) && s.charAt(i)!=' '){
              arr[s.charAt(i)-'0'-1]=sb.toString();
              sb.setLength(0);
            }
            else if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
        }
        sb.setLength(0);
        
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        


        return sb.toString();

    }
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(shuffle(s));
    }
}
