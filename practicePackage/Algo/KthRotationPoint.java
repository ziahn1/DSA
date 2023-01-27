package practicePackage.Algo;

// Given a sorted and rotated array find how many times the array is rotated

// Approach -> find minimum element and return it's index

public class KthRotationPoint {
    
    public static int KthRotationPoint(int[] arr){
        int min = Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
           min= arr[i];
           index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 3, 4};
        System.out.println(KthRotationPoint(arr));
    }
}
