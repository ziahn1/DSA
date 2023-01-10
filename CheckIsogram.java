

public class CheckIsogram {
    
    public static boolean isIsogram(String s){

        s=s.toLowerCase();

    int[] freq = new int[26];

    for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
    }

    for(int i=0;i<26;i++){
        if(freq[i]>1){
            return false;
        }
    }

       return true;
    }


    public static void main(String[] args) {
        String s = "machineA";

        

        boolean result = isIsogram(s);

        System.out.println(result);
    }
}
