package practicePackage.OOPsFundamentals.callByValue;

public class CallByValueForNonPrimitive {
    public static void changeDeveloperDetails(Developer d){
      d.setId(5);

        System.out.println("printing details inside called method "+d.getId());
    }
    public static void main(String[] args) {
        Developer d = new Developer(1, "Zia");
        System.out.println("Details before calling method "+ d.getId()+" "+d.getName());
        changeDeveloperDetails(d);

        System.out.println("Details after calling method "+ d.getId()+" "+d.getName());
    }
}
