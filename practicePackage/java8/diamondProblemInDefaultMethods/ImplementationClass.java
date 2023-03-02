package practicePackage.java8.diamondProblemInDefaultMethods;

public class ImplementationClass implements Interface1,Interface2{
    @Override
    public void m1(){
        Interface1.super.m1();
    }

    public static void main(String[] args) {
        ImplementationClass obj = new ImplementationClass();
        obj.m1();
    }
}
