package practicePackage.Algo;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RemoveDuplicates {

    public static int[] removeDup(int[] arr){
       

     int index=1;
     int i=1;
     while(i<arr.length){
        if(arr[i]!=arr[i-1]){
            arr[index]=arr[i];
            index++;
        }
        i++;
     }

     for(int j=0;j<index;j++){
        System.out.println(arr[j]+" ");
     }

        return arr;
    }
     public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4};
        removeDup(arr);
     }

}
