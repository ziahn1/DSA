

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> remove(int[] arr){
        
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
          if(arr[i]!=arr[i-1]){
              list.add(arr[i]);
          }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,4,2,7,1,8,1,9,3};

        List<Integer> list = remove(arr);

        System.out.println(list);
    }
}
