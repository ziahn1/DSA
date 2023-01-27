package practicePackage.Algo;

public class MakeArrayZeroBySubtractingEqualAMount {

    public static int minOperations(int[] nums){
        int totalOperations=0;
        boolean flag=true;
       while(flag){
        int subOperations=0;
        int smallestPositive=smallestPostiveInteger(nums);
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]>0){
                nums[j]-=smallestPositive;
                subOperations++;
            }
        
        }
        if(subOperations>0){
            totalOperations++;
        }
        else{
            flag=false;
        }
       }
        return totalOperations;
    }
    

    public static int smallestPostiveInteger(int[] nums){
       int smallestPositive = Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0&&nums[i]<smallestPositive)
            smallestPositive=nums[i];
       }

        return smallestPositive;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        int res = minOperations(nums);
        System.out.println(res);
    }
}
