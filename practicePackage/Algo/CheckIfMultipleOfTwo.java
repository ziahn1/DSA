package practicePackage.Algo;

public class CheckIfMultipleOfTwo {
    public static boolean checkNumber(int n){
       while(n>1){
            if(n%2!=0){
                return false;
            }
          n=n/2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(32));
    }
}
