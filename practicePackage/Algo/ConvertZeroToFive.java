package practicePackage.Algo;

public class ConvertZeroToFive {
    public static int convert(int n){
        int result=0;
        int multiplier=1;

       while(n>0){
         int digit=n%10;
         if(digit==0){
            digit=5;
         }
         result=result+digit*multiplier;
         n=n/10;
         multiplier*=10;

         
       }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(convert(10004));
    }
}
