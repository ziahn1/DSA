

public class Compression {
    static String firstComprwssion(String s){
        
        StringBuilder s1 = new StringBuilder();

        s1.append(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                s1.append(s.charAt(i));
            }
        }
        
        return s1.toString();
    }

    static String secondCompression(String s){
       int sum=1;
       StringBuilder s2 = new StringBuilder();
       for(int i=1;i<s.length();i++){
           if(s.charAt(i)!=s.charAt(i-1)){
             s2.append(s.charAt(i-1));
             s2.append(sum);

             sum=0;
           }

           else{
               sum++;
           }
       }

       s2.append(s.charAt(s.length()-1));
       s2.append(sum);



        return s2.toString();
    }

    public static void main(String[] args) {
        String s = "aaaabbbbccccdddddaaaa";
        String res1 = firstComprwssion(s);
        String res2 = secondCompression(s);

        System.out.println(res1);
        System.out.println(res2);
    }
}
