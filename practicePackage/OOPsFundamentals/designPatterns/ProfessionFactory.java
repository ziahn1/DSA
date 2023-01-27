package practicePackage.OOPsFundamentals.designPatterns;

public class ProfessionFactory {
    public static Profession getProfessionInstance(String profession){
        
        if(profession.equalsIgnoreCase("Doctor")){
            return new Doctor();
        }
        else if(profession.equalsIgnoreCase("Engineer")){
            return new Engineer();
        }
        
        
        
        return null;
    }
}
