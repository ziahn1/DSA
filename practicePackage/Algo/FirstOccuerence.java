package practicePackage.Algo;

public class FirstOccuerence {
    public static int findFirstOccurrence(String string, String substring) {
        int i = 0;
        int j = 0;
        while (i < string.length() && j < substring.length()) {
          if (string.charAt(i) == substring.charAt(j)) {
            i++;
            j++;
          } else {
            i++;
            j = 0;
          }
        }
        if (j == substring.length()) {
          return i-j;
        }
        return -1;
      }
    
      public static void main(String[] args) {
        String string = "Hello World! zia";
        String substring = "World";
        int index = findFirstOccurrence(string, substring);
        System.out.println("First occurrence of '" + substring + "' at index: " + index);
      }
}
