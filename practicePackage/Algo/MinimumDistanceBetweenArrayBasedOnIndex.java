package practicePackage.Algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumDistanceBetweenArrayBasedOnIndex {
    public static int getMinDistance(int a[], int n, int x, int y){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            ArrayList<Integer> list = map.get(a[i]);
            if(list==null){
                list = new ArrayList<>();
                list.add(i);
                map.put(a[i],list);
            }
            else {
                if(!list.contains(a[i])) list.add(i);
            }
        }
        ArrayList<Integer> l1 = map.get(x);
        ArrayList<Integer> l2 = map.get(y);
        int minDistance= Integer.MAX_VALUE;
        for(int e1 : l1){
            for(int e2 : l2){
                if(Math.abs(e1-e2)<minDistance){
                    minDistance=Math.abs(e1-e2);
                }
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,1,2,1,5,6,7,3};
       int res = getMinDistance(arr,10,5,3);
        System.out.println(res);
    }
}


