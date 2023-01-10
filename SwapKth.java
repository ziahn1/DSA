

public class SwapKth {

    static void swap(int beg, int end,int[] a){
        a[beg]=a[beg]+a[end];
        a[end]=a[beg]-a[end];
        a[beg]=a[beg]-a[end];
    }
    
    public static void main(String[] args) {
        int[] arr={4,6,2,8,5,9,1,16,25,34,78};
        int k =3;
        int n=arr.length;
        swap(k-1, n-k, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
