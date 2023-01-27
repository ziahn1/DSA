package practicePackage.OOPsFundamentals.designPatterns;

public class Main {
    public static void main(String[] args) {
        Profession pr = ProfessionFactory.getProfessionInstance("Engineer");
        pr.displayProfession();
    }
}
