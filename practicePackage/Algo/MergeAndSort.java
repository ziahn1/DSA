package practicePackage.Algo;

public class MergeAndSort {
    public static int[] sortAndMerge(int[] nums1,int[] nums2){
        int index=0;
        int[] res = new int[nums1.length+nums2.length];
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){

            if(nums1[i]==nums2[j]){
                res[index++]=nums1[i++];
                res[index++]=nums2[j++];
            }
          
            if(nums1[i]<nums2[j]){
               res[index++]=nums1[i++];
            }
            else if(nums2[j]<nums1[i]){
                res[index++]=nums2[j++];
            }




        }
        if(i<nums1.length){
            while(i<nums1.length){
                res[index++]=nums1[i++];
            }
        }
        if(j<nums2.length){
            while(j<nums2.length){
                res[index++]=nums2[j++];
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,8};
        int[] nums2 = {2,5,6};
     int[] res = sortAndMerge(nums1, nums2);

     for (int i : res) {
        System.out.print(i+" ");
     }
    }
}
