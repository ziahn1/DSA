


public class Rotation {

    static void rotate(int start, int end, int[] a){
        // int i=0,j=a.length-1;
        while(start<end){
            
            a[start]=a[start]+a[end];
            a[end]=a[start]-a[end];
            a[start]=a[start]-a[end];


            
            start++;
            end--;
        }

        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i]+ " ");
        // }

        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotate(0, 3, arr);
        rotate(0, 4, arr);
      
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    
    }
}
