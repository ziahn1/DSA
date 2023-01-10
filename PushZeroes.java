

import java.sql.PseudoColumnUsage;

public class PushZeroes {


    public static int[] pushZero(int[] arr){
  int count=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[count++]=arr[i];
        }
      }
      for(int i=count;i<arr.length;i++){
          arr[i]=0;
      }

        return  arr;
    }


    


    public static void main(String[] args) {
        int[] a ={1,0,2,4,0,5};

        int[] res = pushZero(a);
        
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

        
    }
    
}
