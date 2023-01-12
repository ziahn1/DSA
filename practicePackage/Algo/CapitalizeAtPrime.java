package practicePackage.Algo;

public class CapitalizeAtPrime {
    public static void capitalizeCharacterAtPrimeIndex(String str){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(isPrimeIndex(i)){
                if(Character.isLowerCase(str.charAt(i))){
                    char c = Character.toUpperCase(str.charAt(i));
                    result.append(c);
                }
                else{
                    result.append(str.charAt(i));
                }
            }
            else{
                result.append(str.charAt(i));
            }
        }
        
        System.out.println(result.toString());
    }
    
    public static boolean isPrimeIndex(int index){
        if(index==0 || index==1)
            return false;
        
        for(int i=2;i<=index/2;i++){
            if(index%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String str1 = "haCKeRrAnk";
        String str2 = "semester";
        String str3 = "codecats";
        String str4 = "datastructure";

        String[] arr = {"codecats",
            "society",
            "hackerrank",
            "semester",
            "datastructure"};
      for(int i=0;i<arr.length;i++){
       capitalizeCharacterAtPrimeIndex(arr[i]);
        
      }
        
    
    }
}
