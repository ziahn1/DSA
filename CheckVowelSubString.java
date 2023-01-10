public class CheckVowelSubString {

    public static int countVowelSubstring(String word){
        int count=0;
        for(int i=0;i<word.length()-4;i++){
            for(int j=i+4;j<=word.length();j++){
                if(word.substring(i,j).length()>=5 && isValid(word.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isValid(String s){
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                return false;
            }
            freq[c-'a']++;
        }
        if(freq['a'-'a']==0 || freq['e'-'a']==0 || freq['i'-'a']==0 || freq['o'-'a']==0 || freq['u'-'a']==0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "cuaieuouac";
        String s2 = "aeiouu";
        int count = countVowelSubstring(s2);
        System.out.println(count);
    }
}
