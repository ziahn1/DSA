package practicePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayInGroups {
    static ArrayList<Integer> reverseInGroups(ArrayList<Integer> arr, int n, int k) {
      if(k==n){
          reverse(arr,0, arr.size()-1);
          return arr;
      }
        int index=-1;
        int i=0,j=k-1;
        while(i<n && j<n){
                reverse(arr,i,j);
              i=j+1;
              j=j+k;

               index=i;

        }
        if(index!=-1){
            reverse(arr,index,arr.size()-1);
        }

        return arr;
    }
    public static void reverse(ArrayList<Integer> arr,int i,int j){
        while(i<=j){
            Collections.swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        ArrayList<Integer> res = reverseInGroups(list,12,12);
        for (int i : res){
            System.out.print(i + " ");
        }
    }

}
