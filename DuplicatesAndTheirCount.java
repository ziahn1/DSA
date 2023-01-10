

public class DuplicatesAndTheirCount {
     static void duplicatesAndCount(String s){
      
        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
           freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq[i]>1){
                System.out.println("Duplicate element : "+ (char)(i+'a')+" and it's count is "+ freq[i]);
            }
        }

    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";

        duplicatesAndCount(s);
    }
}
