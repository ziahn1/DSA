package practicePackage.Algo;

public class TargetIn1IndexedArray {
    public static int[] findTargetIndex(int[] arr,int target){
     int l=0;
     int h=arr.length-1;
     int[] res = {-1,-1};
     while(l<=h){
        int sum=arr[l]+arr[h];
        if(sum==target){
            res[0]=l;
            res[1]=h;
            l++;
            h--;
         }
         else if(sum>target){
            h--;
         }
         else{
           l++;
         }
     }
     return res;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int target= sc.nextInt();
        int[] arr = {2,7,8,9};

        int[] res = findTargetIndex(arr, 9);
        System.out.println(res[0]+" "+res[1]);
    }

}
