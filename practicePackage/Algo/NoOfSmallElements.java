package practicePackage.Algo;

public class NoOfSmallElements {
    public static int[] smallerElements(int[] arr){
        
        int[] freq = new int[100];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

       int smallerElements = freq[0];
       int i=1;
       while(i<100){
        int temp=freq[i];
        freq[i]=smallerElements;
        smallerElements=smallerElements+temp;
        i++;
       }

       for(int j=0;j<arr.length;j++){
        arr[j]=freq[arr[j]];
       }
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {8,1,2,2,3};
        int[] res = smallerElements(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
