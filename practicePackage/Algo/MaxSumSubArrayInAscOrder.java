package practicePackage.Algo;

public class MaxSumSubArrayInAscOrder {
    public static int maxSum(int[] arr){
       int maxSum=Integer.MIN_VALUE;
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
       if(maxSum<sum){
        maxSum=sum;
       }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,5,10,50};
        System.out.println(maxSum(arr));
    }
}
