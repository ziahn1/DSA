package practicePackage.Algo;

public class PatterPrintTriangle {
    public static void print(int n){
      for (int i = 0; i <=n; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("X ");
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
        print(5);
    }
}
