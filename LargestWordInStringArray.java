

public class LargestWordInStringArray {
    String largestWord(String[] arr){

     int largest = Integer.MIN_VALUE;
     int index=0;
     for(int i=0;i<arr.length;i++){
         if(largest<arr[i].length()){
             largest=arr[i].length();
             index=i;
         }

     }
       String res = arr[index];

        return res;
    }

    public static void main(String[] args) {
        String[] arr ={"zia","haider","asdfghjkl"};

     LargestWordInStringArray large = new LargestWordInStringArray();

    String result = large.largestWord(arr);

    System.out.println(result);
    }
}
