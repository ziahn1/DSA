package practicePackage.Algo;


// Given a sorted array find pair whose sum is closest to given number x.
public class PairWhoseClosestSumEqualToX {
    
    public static int[] pair(int[] arr,int x){
        int[] res = new int[2];
        int l=0;
        int h=arr.length-1;
        int diff = Integer.MAX_VALUE;
        while(l<=h){
          if(Math.abs(arr[l]+arr[h]-x)<diff){
            diff=Math.abs(arr[l]+arr[h]-x);
            res[0]=l;
            res[1]=h;
          }
          else if(arr[l]+arr[h]<x){
            l++;
          }
          else{
            h--;
          }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10, 22, 28, 29, 30, 40}; int x = 54;
        int[] res = pair(arr, x);
        System.out.println(res[0] + " "+ res[1]);
    }
}
