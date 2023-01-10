package practicePackage;

import java.util.HashMap;

//Given an array of N integers. Find the first element that occurs at least K number of times.
public class FirstElementOccurKTimes {
    public static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int firstOccurrence = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if (!map.containsKey(a[i])){
                map.put(a[i],1);
            }
            else {
                map.put(a[i],map.get(a[i])+1);
            }
        }
        for(int i=a.length-1;i>=0;i--){
            if(map.get(a[i])!=-1){
                if(map.get(a[i])>=k){
                    if(i<firstOccurrence){
                        firstOccurrence=i;
                        map.put(a[i],-1);
                    }
                }
            }
        }


      return a[firstOccurrence];
    }

    public static void main(String[] args) {
       int A[] = {1, 7, 4, 3, 4, 8, 7};
       int[] B = {4,2,2,2,3,4,4,4,3,2};
       int res= firstElementKTime(B,10,3);
        System.out.println(res);
    }
}



//    public int firstElementKTime(int[] a, int n, int k) {
//        int [] numbers = new int[100001];
//        for(int num :a){
//            numbers[num]++;
//            if(numbers[num]==k)
//                return num;
//
//        }
//        return -1;
//    }
