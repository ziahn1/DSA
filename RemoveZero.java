

public class RemoveZero {
    public static int remove(int n){
       
        int len =(int) Math.log10((double)n);
        int multOfTen =(int) Math.pow(10, (double)len);

        int res=0;

        while(n>0){
            int temp =n/multOfTen;
            n=n%multOfTen;
            multOfTen=multOfTen/10;
         
            if(temp==0){
                res=res*10+5;
            }
            else{
                res=res*10+temp;
            }

        }
       
        return res;

    }

    public static void main(String[] args) {
        int num = 1004;

       int res= remove(num);  
       
       System.out.println(res);
     }
}
