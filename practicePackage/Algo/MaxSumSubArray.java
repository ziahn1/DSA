package practicePackage.Algo;

public class MaxSumSubArray {
    public static int maxSum(int[] arr){
        int curSum=0;
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        
        
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={5,-4,-2,6,-1};
        int res = maxSum(arr);
        System.out.println(res);
    }
}
