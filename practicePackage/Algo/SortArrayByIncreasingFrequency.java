package practicePackage.Algo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SortArrayByIncreasingFrequency {
    public static int[] sort(int[] arr){
       HashMap<Integer,Integer> map = new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
          if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i])+1);
          }
          else{
            map.put(arr[i], 1);
          }
        }
        Set<Integer> set = map.keySet();

        return null;
    }
}
