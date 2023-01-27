package practicePackage.Algo;

public class PatternPrinting1 {
    public static void print(){
        for(int i=1;i<=8;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print();
    }
}
