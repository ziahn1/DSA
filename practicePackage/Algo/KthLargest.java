package practicePackage.Algo;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public static int kthLargest(int[] arr,int k){
      
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }

        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
              pq.poll();
              pq.add(arr[i]);
            }
        }
    
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr={4,6,1,12,8,9,3};
        System.out.println(kthLargest(arr, 2));
    }
}
