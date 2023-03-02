package practicePackage.Algo;

public class RotateArray {

     public static void rotateByKPosition(int[] arr,int k){
         rotate(arr, 0, arr.length-k-1);
         rotate(arr, k-1, arr.length-1);
         rotate(arr, 0, arr.length-1);
     }



    public static void rotate(int[] arr,int l,int h){
         while(l<=h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
         }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotateByKPosition(arr, 3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
