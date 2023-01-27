package practicePackage.Algo;

import java.util.Arrays;

public class SortStringWithVowelAndConsonant {
    public static String sort(String s){
       char[] ch = s.toCharArray();
       char[] result = new char[ch.length];

       Arrays.sort(ch);
     for(int i=0;i<result.length;i++){
        if(ReverseOnlyAlphabets.isVowel(ch[i])){
            
        }
     }
       
        return null;
    } 
}
