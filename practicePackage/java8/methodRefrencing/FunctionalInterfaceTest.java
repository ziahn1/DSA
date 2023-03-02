package practicePackage.java8.methodRefrencing;

public class FunctionalInterfaceTest {
    

    public static void main(String[] args) {
        MyFunctionalInterface fi = SampleClass :: print;


        fi.show();
    }
}
