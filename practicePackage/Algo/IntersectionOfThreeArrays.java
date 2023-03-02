package practicePackage.Algo;

public class IntersectionOfThreeArrays {
    public static int[] intersection(int[] arr1,int[] arr2,int[] arr3){
       
        int smallerSize = Math.min(arr1.length, arr2.length);
        smallerSize = Math.min(smallerSize, arr3.length);

        int[] res = new int[smallerSize];
        int i=0,j=0,k=0;
        int index=0;

        while(i<smallerSize && j<smallerSize && k<smallerSize){

           if(arr1[i]==arr2[j] && arr1[i]==arr3[k]){
               res[index++]=arr1[i];
               i++;
               j++;
               k++;
           }
           else if(arr1[i]==arr2[j] && arr1[i]!=arr3[k]){
            if(arr1[i]<arr3[k]){
                i++;
                j++;
            }
            else{
                k++;
            }
           }

           else if(arr1[i]==arr3[k] && arr1[i]!=arr2[j]){
            if(arr1[i]<arr2[j]){
                i++;
                k++;
            }
            else{
                j++;
            }
           }

           else if(arr2[j]==arr3[k] && arr1[i]!=arr2[j]){
            if(arr2[j]<arr1[i]){
                j++;
                k++;
            }
            else{
                i++;
            }
           }

        else if(arr1[i]!=arr2[j] && arr1[i]!=arr3[k]){
             if(arr1[i]>arr2[j]){
                if(arr3[k]>arr1[i]){
                    i++;
                    j++;
                }
                else{
                    j++;
                    k++;
                }
             }
             else{
                if(arr2[j]>arr3[k]){
                    i++;
                    k++;
                }
                else{
                    i++;
                    j++;
                }
             }
        }



        } 

        return res;
    }

    public static void main(String[] args) {
        int[] arr1={1,5,10,20,40,80};
        int[] arr2={6,7,20,80,100};
        int[] arr3={3,4,15,20,30,70,80,120};
        int[] res = intersection(arr1, arr2, arr3);
        for(int i : res){
            System.out.println(i+" ");
        }
    }

    
}
