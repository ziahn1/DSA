package practicePackage.Algo;

public class MaxSumInAscSubArray {
    public static int maxSum(int[] arr){
       int maxSum=0;
       int sum=arr[0];
       for(int i=1;i<arr.length;i++){
          if(arr[i]<arr[i-1]){
            maxSum=Math.max(maxSum, sum);
            sum=arr[i];
          }
          else{
               sum+=arr[i];
          }
       }

       maxSum=Math.max(maxSum, sum);

      
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,5,10,50};
        int res =maxSum(arr);
        System.out.println(res);
    }
}
