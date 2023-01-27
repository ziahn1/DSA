package practicePackage.OOPsFundamentals.callByValue;

public class CallingPrimitiveData {
    public static void dealingWithPrimitiveData(int a,int b){
        a=a*b*5; 
        b=b+5;          
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int x=2;
        int y=3;
       dealingWithPrimitiveData(x, y);
       System.out.println("parameters inside main " + x +" "+ y);
    }
}
