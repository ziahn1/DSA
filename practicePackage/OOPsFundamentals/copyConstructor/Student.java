package practicePackage.OOPsFundamentals.copyConstructor;

public class Student {
    private int id;
    private String name;

    public Student(Student s){
        this.id=s.id;
        this.name=s.name;
    }
    public Student(int id,String name){
       this.id=id;
       this.name=name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(2,"Zia");
        Student s2 = new Student(s1);
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
