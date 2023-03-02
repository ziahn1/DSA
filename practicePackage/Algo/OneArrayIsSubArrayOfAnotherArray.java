package practicePackage.Algo;

import java.util.HashMap;

public class OneArrayIsSubArrayOfAnotherArray {
    public static boolean isSubArray(int[] arr1,int[] arr2){
     if(arr1.length>arr2.length){
        return false;
     }
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i=0;i<arr2.length;i++){
        if(map.containsKey(arr2[i])){
            map.put(arr2[i], map.get(arr2[i])+1);
        }
        else{
            map.put(arr2[i], 1);
        }
     }

     for(int i=0;i<arr1.length;i++){
        if(map.get(arr1[i])==null){
            return false;
        }
     }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,16,18};
        int[] arr2={1,2,3,4,5,16,18};
        System.out.println(isSubArray(arr1, arr2));
    }
}
