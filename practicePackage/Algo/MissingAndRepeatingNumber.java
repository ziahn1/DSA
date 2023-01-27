package practicePackage.Algo;

public class MissingAndRepeatingNumber {
    public static int[] missingAndRepeating(int[] arr,int n){
        int[] res = new int[2];
    for(int i=0;i<n;i++){
        int correct =arr[i];
        if(arr[i]!=n && arr[i]!=arr[correct]){
            int temp=arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
        }
        
    }
    for (int i=0; i<n; i++) {
        if(arr[i]!=n && arr[i]!=i){
            res[0]=arr[i];
            res[1]=i;
        }
    }
     

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,3,5,4,1};
        int[] res=missingAndRepeating(arr, 6);
        System.out.println(res[0]+" "+res[1]);
    }
}
