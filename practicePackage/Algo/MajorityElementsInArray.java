package practicePackage.Algo;

import java.util.Arrays;

public class MajorityElementsInArray {
    public static int majorityElemenet(int[] arr){
      Arrays.sort(arr);
      int n=arr.length;
      int count=1;
      for(int i=1;i<n;i++){        
        if(arr[i]!=arr[i-1]){
            if(count>n/2){
                return arr[i-1];
            }
            count=1;
        }
        else{
            count++;
        }

      }
      if(count>n/2){
        return arr[n-1];
      }

        return -1;

    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElemenet(nums));

    }
}
