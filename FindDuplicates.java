
import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicates {
    public static ArrayList<Integer> duplicates(int[] arr){
   ArrayList<Integer> list = new ArrayList<>();
    Arrays.sort(arr);

    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
    }

        return list;
    }

    public static void main(String[] args) {
        int[] arr ={8,4,7,8,1,4,1,2,9,4};

        ArrayList<Integer> list = duplicates(arr);

        System.out.println(list);
    }
}
