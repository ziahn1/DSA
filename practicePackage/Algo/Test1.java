package practicePackage.Algo;

public class Test1 {
    public static int maxConsecutiveDefectiveProducts(int[] arr){
        
        int consecutiveDefectiveProducts=0;
        int maxDefectiveProducts=0;
        
        if(arr[0]==1){
            consecutiveDefectiveProducts=1;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                
                if(maxDefectiveProducts<consecutiveDefectiveProducts){
                    maxDefectiveProducts=consecutiveDefectiveProducts;
                    consecutiveDefectiveProducts=0;
                }
                
            }
            else if(arr[i]==1){
                consecutiveDefectiveProducts++;
            }
        }
        if(consecutiveDefectiveProducts>maxDefectiveProducts){
            maxDefectiveProducts=consecutiveDefectiveProducts;
        }
        return maxDefectiveProducts;
    }


    public static void main(String[] args) {
        int[] arr={1,0,1,1,1,0,1,1,1,1,1};
        int res= maxConsecutiveDefectiveProducts(arr);
        System.out.println(res);
        
    }
}
