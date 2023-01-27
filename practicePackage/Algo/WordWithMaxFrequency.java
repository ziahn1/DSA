package practicePackage.Algo;

import java.util.HashMap;

public class WordWithMaxFrequency {
    public static int maxFreq(String s){
        HashMap<String,Integer> map = new HashMap<>();
        int maxFreq=0;
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(String str : map.keySet()){
            int freq = map.get(str);
            if(freq>maxFreq){
                maxFreq=freq;
            }
        }
        return maxFreq;
    }
    public static void main(String[] args) {
        String s = "the devil in the sky";
        int result = maxFreq(s);
        System.out.println(result);
    }
}
