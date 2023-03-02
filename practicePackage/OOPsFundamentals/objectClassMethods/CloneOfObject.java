package practicePackage.OOPsFundamentals.objectClassMethods;

public class CloneOfObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1  = new Person(1234567, 26, "Zia");
        Person p2 = (Person)p1.clone();

        p1.setAge(34);

        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
    }
}
