package practicePackage.Algo;

public class MaxStockProfit {
    public static int getMaxProfit(int[] arr){
    int maxProfit=0;
     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                int profit=arr[i]-arr[j];
                maxProfit=Math.max(maxProfit, profit);
            }
         }
     }
     return Math.abs(maxProfit);
    }

    public static void main(String[] args) {
        int[] arr =  {7,6,4,3,1};

        System.out.println(getMaxProfit(arr));
    }
}
