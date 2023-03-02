package practicePackage.Algo;

public class SumofNFibonacci {
    public static int sum(int n){

       int a=0;
       int b=1;
       int sum=1;
       for(int i=2;i<n;i++){
        int c=a+b;
        sum+=c;
        a=b;
        b=c;
       }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
