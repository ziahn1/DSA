package practicePackage.Algo;

public class StringPattern {
    public static void printStringPattern(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(j<=i){
                    System.out.print('.');
                }
                else{
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printStringPattern("@io30r");
    }
}
