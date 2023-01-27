package practicePackage.OOPsFundamentals.thisConcept;

public class ThisInsideStaticConcept {
    static int x;
    public static void setX(int x){
        ThisInsideStaticConcept.x=x;
    }

    public static void main(String[] args) {
        ThisInsideStaticConcept.setX(4);
      System.out.println(ThisInsideStaticConcept.x);  
    }
}
