package practicePackage.Algo;

public class SenetenceValidation {

    public static boolean isValidWord(String s){
       int isCharacterFromFirstLanguage=0;
       int isCharacterFromSecondLanguage=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='N' && s.charAt(i)<='Z'){
                isCharacterFromFirstLanguage++;
             }
             else if(s.charAt(i)>='a' && s.charAt(i)<='m'){
                isCharacterFromSecondLanguage++;
             }
        }
        if(isCharacterFromFirstLanguage>0 && isCharacterFromSecondLanguage>0){
            return false;
        }
        else if(isCharacterFromFirstLanguage==s.length()){
            return true;
        }
        else if(isCharacterFromSecondLanguage==s.length()){
            return true;
        }

        return false;
    }
    
public static void main(String[] args) {
    String s = "Mz";
    boolean result = isValidWord(s);
    System.out.println(result);
}
}
