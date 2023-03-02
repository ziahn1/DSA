package practicePackage.Algo;

public class FirstAndLastIndex {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int l=0,h=nums.length-1;
        while(l<nums.length && h>=0){
            if(nums[l]==target && res[0]==-1){
                res[0]=l;
            }
            if(nums[h]==target && res[1]==-1){
                res[1]=h;
            }
            l++;
            h--;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] res = searchRange(nums, 8);
        System.out.println(res[0]+" "+res[1]);
    }
}
