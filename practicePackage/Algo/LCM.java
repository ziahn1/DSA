package practicePackage.Algo;

public class LCM {
    public static int lcm(int a,int b){
       int lcm=1;
       int max=Math.max(a, b);
       for(int i=max;i<a*b;i=i+max){
        if(i%a==0 && i%b==0){
            lcm=i;
            break;
        }
       }
       
        return lcm;
    }
    public static void main(String[] args) {
        System.out.println(lcm(3, 6));
    }
}
