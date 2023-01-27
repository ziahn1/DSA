package practicePackage.Algo;

public class MissingRoleNumberZeroToN {
    
    public static int findMissingRoleNumber(int[] nums){
        int i=0;
        int n= nums.length;
        while(i<n){
            int correct = nums[i];
            if(nums[i]<n && nums[i]!=nums[correct]){
                int temp = nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else{
             i++;
                }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j){
                return j;
            }
        }
       return n; 
    }
    public static void main(String[] args) {
        int[] arr = {2,0,4,1};
        System.out.println(findMissingRoleNumber(arr));
    }
}
