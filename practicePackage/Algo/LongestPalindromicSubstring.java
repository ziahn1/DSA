package practicePackage.Algo;

public class LongestPalindromicSubstring {
    public static int substring(String s){
         int lengthOfLongestPalindromicSubString=0;
         int largeOddFreqInCapArr=0;
         int largeOddFreqInSmallArr=0;
          int[] capFreq = new int[26];
          int[] smallFreq = new int[26];
          for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                capFreq[s.charAt(i)-'A']++;
            }
            else{
                smallFreq[s.charAt(i)-'a']++;
            }
          }
          for(int i=0;i<26;i++){
            if(capFreq[i]%2==0){
                lengthOfLongestPalindromicSubString+=capFreq[i];
            }
            else{
                largeOddFreqInCapArr = Math.max(largeOddFreqInSmallArr, capFreq[i]);
            }

            if(smallFreq[i]%2==0){
                lengthOfLongestPalindromicSubString+=smallFreq[i];
            }
            else{
                largeOddFreqInSmallArr=Math.max(largeOddFreqInSmallArr, smallFreq[i]);
            }
          }
          lengthOfLongestPalindromicSubString+=largeOddFreqInCapArr;
          lengthOfLongestPalindromicSubString+=largeOddFreqInSmallArr;

          return lengthOfLongestPalindromicSubString;
    }

    public static void main(String[] args) {
        String s ="bAbbcAAA";
        System.out.println(substring(s));
    }
}
