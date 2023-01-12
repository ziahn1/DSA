package practicePackage.Algo;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static int getFirstNonRepeatingCharacterIndex(String str){
     HashMap<Character,Integer> map = new HashMap<>();
     for(int i=0;i<str.length();i++){
        if(map.containsKey(str.charAt(i))){
            map.put(str.charAt(i), -1);
        }
        else{
            map.put(str.charAt(i), i);
        }
     }
     for(char c : map.keySet()){
        if(map.get(c)!=-1){
            return map.get(c);
        }
     }
        return -1;
    }

    public static void main(String[] args) {
        String str ="abbbacccv";
       int index = getFirstNonRepeatingCharacterIndex(str);
        System.out.println(index);
    }

   
}
