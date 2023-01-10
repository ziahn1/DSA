package practicePackage;

public class AverageAtEachPoint {
    public static void average(int[] arr){
       int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            float avg = sum/(i+1);
            System.out.println(avg);
        }
    }
    public static void main(String[] args) {
        int[] a ={10, 20, 30, 40, 50};

        average(a);
    }
}
