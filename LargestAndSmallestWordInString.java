

public class LargestAndSmallestWordInString {
    
    public static void find(String s){

        String[] arr = s.split(" ");
        //  here i am going to keep record of length of largest word and its index and s=length of smallest word and it's index
        Integer largestIndex=0;
        Integer smallestIndex=0;
        int smallest=Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>largest){
                largestIndex=i;
                largest=arr[i].length();
            }
            if(arr[i].length()<smallest){
                smallestIndex=i;
                smallest=arr[i].length();
            }
        }

        System.out.println("Smallest word is "+ arr[smallestIndex] + " and largest word is "+ arr[largestIndex]);
    }
    public static void main(String[] args) {
        String str ="Hardships often prepare ordinary people for an extraordinary destiny";

        find(str);
    }
}
