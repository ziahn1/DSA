package practicePackage.Algo;

import java.util.Arrays;

public class MajorityElements {
    
    public static int majority(int[] a){

     Arrays.sort(a);
     int count=1;
     int n=a.length;

     for(int i=1;i<n-1;i++){
         if(a[i]!=a[i-1]){
             if(count>n/2){
                 return a[i-1];
             }
             else{
                 count=1;
             }
         }
         else{
             count++;
         }
     }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,9,1,6,1,8,8,8,1,5,1,2,1,7,1};

        int res = majority(arr);

        System.out.println(res);
    }
}
