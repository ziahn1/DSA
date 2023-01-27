package practicePackage.Algo;

public class SearchElementInSortedAndRotatedArray {
    public static int search(int[] arr,int target){
        int l=0,h=arr.length-1;

        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                return mid;
            }
            // firstly I will check whether left part is sorted or not 
            if(arr[l]<arr[mid]){
            if(target>=arr[l] && target<=arr[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        else{
            if(target>=arr[mid] && target<=arr[h]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
    }
        
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={10,1,2,3,4,5,6,7};
        int target=2;
        System.out.println(search(arr, target));
    }
}
