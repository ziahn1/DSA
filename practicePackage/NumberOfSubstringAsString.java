package practicePackage;

public class NumberOfSubstringAsString {

    public static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String s : patterns){
            if (word.indexOf(s)!=-1){
                count++;
            }
        }
      return count;
    }

    public static void main(String[] args) {
       String[] patterns = {"a","abc","bc","d"};
       String word = "abc";
       int res = numOfStrings(patterns,word);
        System.out.println(res);
    }
}
