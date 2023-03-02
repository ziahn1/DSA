package practicePackage.Algo;

public class Zombies {
    public static int find(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            if(gcd(arr[i], arr[i+1])==1 && arr[i]>arr[i+1]){
                return i;
            }
        }

        return 0;
    }

    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        int[] arr={0,0,0,0,0,0};

        System.out.println(find(arr));
    }
}
