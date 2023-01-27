package practicePackage.OOPsFundamentals.inheritanceConcepts;

public class Parent {
    public void m1() {
        System.out.println("This is parent");
    }
}
class Child extends Parent{
    public void m1(){
        System.out.println("This is child");
    } 
    public static void main(String[] args) {
        Parent P = new Child();
        P.m1();
    }
}
