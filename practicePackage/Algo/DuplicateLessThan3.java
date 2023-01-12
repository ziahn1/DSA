package practicePackage.Algo;

import java.util.ArrayList;

public class DuplicateLessThan3 {
    public static ArrayList<Integer> isDuplicate(int[] arr){
          int freq=1;
          ArrayList<Integer> list = new ArrayList<>();
          for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                addElement(arr, list, i-1, freq);
                freq=1;
            }
            else{
                freq++;
            }
          }
          if(freq<3){
            addElement(arr, list, arr.length-1, freq);
          }

         return list;
    }

    public static void addElement(int[] arr,ArrayList<Integer> list, int index,int freq){
        if(freq==1){
            list.add(arr[index]);
        }
        if(freq==2){
            list.add(arr[index]);
            list.add(arr[index]);
        }
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,3,4,4,5,5,5,5};
        ArrayList<Integer> result= isDuplicate(input);
        int size = result.size();
        for(int i=0;i<size;i++){
            System.out.print(result.get(i)+" ");
        }
    }
}
