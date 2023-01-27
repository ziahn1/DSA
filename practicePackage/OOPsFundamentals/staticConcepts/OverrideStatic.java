package practicePackage.OOPsFundamentals.staticConcepts;

public class OverrideStatic {
    public static void m1(){
        System.out.println("This is parent");
    }
}
class Child extends OverrideStatic{
    public static void m1(){
        System.out.println("This is child");
    }
    public static void main(String[] args) {
        OverrideStatic ref = new Child();
        ref.m1();
    }
}
