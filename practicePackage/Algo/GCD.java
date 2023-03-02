package practicePackage.Algo;

public class GCD {
    public static int gcd(int n1,int n2){
       int gcd=1;
       int smaller = Math.min(n1, n2);
       int i=2;
       while(i<=smaller){
        if(n1%i==0 && n2%i==0){
            gcd=i;
        }
        i++;
       }
      
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println(gcd(2, 8));
    }
}
