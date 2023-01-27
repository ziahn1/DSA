// You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.

// Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.



package practicePackage.Algo;

public class RemoveLetterToEqualizeFrequency {
    public static boolean removeLetter(String str){
        
        int[] freq = new int[26];
        int freqDiff=0;
        int index=0;
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }

        for(int i=1;i<26;i++){
          if(Math.abs(freq[i]-freq[i-1])>0){
            if(Math.abs(freq[i]-freq[i-1])==1){
                freqDiff++;
            }
            else{
                return false;
            }
            

          }

        }
        if(freqDiff==0 || freqDiff==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s ="abcc";
        boolean result = removeLetter(s);
        System.out.println(result);
    }
}
