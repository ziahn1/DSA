package practicePackage.Algo;

import java.util.ArrayList;

public class DuplicateLessThan3 {
    public static ArrayList<Integer> isDuplicate(int[] arr){
          int freq=1;
          ArrayList<Integer> list = new ArrayList<>();
          int[] output = new int[arr.length];
          for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                if(freq<3){
                    list.add(arr[i-1]);
                }
                freq=1;
            }
            else{
                freq++;
            }
          }
          if(freq<3){
            list.add(arr[arr.length-1]);
          }

         return list;
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,3};
        ArrayList<Integer> result= isDuplicate(input);
        int size = result.size();
        for(int i=0;i<size;i++){
            System.out.print(result.get(i)+" ");
        }
    }
}
