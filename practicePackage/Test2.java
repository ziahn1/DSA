package practicePackage;

public class Test2 {
    public static int maxConsecutiveDefectiveProducts(int[] arr){
        
        int consecutiveDefectiveProducts=0;
        int maxDefectiveProducts=0;
        
        if(arr[0]==1){
            consecutiveDefectiveProducts=1;
        }
        for(int i=1;i<arr.length;i=i++){
            if(arr[i]==0){
                
                if(maxDefectiveProducts<consecutiveDefectiveProducts){
                    maxDefectiveProducts=consecutiveDefectiveProducts;
                    consecutiveDefectiveProducts=0;
                }
                else if(arr[i]==1){
                    consecutiveDefectiveProducts++;
                }
            }
        }
        return maxDefectiveProducts;
    }
    public static void main(String[] args) {
        
    }
}
