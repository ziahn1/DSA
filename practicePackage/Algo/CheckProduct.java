package practicePackage.Algo;

public class CheckProduct {
     public static Pair isProductExist(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
          int secIndex=checkForProduct(0, arr.length-1, arr, i, k);
          
            if(secIndex!=-1){
                return new Pair(arr[i], arr[secIndex]);
              }
        }
        return null;
     }

     public static int checkForProduct(int l,int h,int[] arr,int i,int k){
        while(l<=h){
            int mid=(l+h)/2;
        if(arr[mid]*arr[i]==k){
            return mid;
        }
        else if(arr[mid]*arr[i]>k){
            h=mid-1;
        }
        else{
            l=mid+1;
        }
    }
        
        return -1;
     }

     public static void main(String[] args) {
        int[] arr = {1,4,5,7,10};
        Pair p = isProductExist(arr, 20);
        if(p==null){
            System.out.println("No such elements Exist");
        }
        else{
            System.out.println("pair ("+p.getA()+","+p.getB()+")");
        }
        
     }
}
class Pair{
    int a;
    int b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
}
