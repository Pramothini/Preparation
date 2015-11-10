package leetcode;

/**
 * This is an extension of House Robber.

After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * @author pramothinidk
 *
 */
public class HouseRobber2 {

    public int rob(int[] nums) {
        if(nums.length >1)
            return Math.max(robHelper(nums,0,nums.length-1), robHelper(nums,1,nums.length));
        else
            return robHelper(nums,0,nums.length);
    }
    
     public int robHelper(int[] nums, int low, int high) {
        if(nums.length == 0) return 0;
        int[] result = new int[nums.length];
        result[low] = nums[low];
        if(nums.length > low+1){
            result[low+1] = Math.max(result[low],nums[low+1]);
        }
        if(nums.length > low+2)
        for(int i=low+2; i<high ; i++){
            result[i] = Math.max(result[i-2] + nums[i] , result[i-1]);
        }
        
        return result[high-1];
    }

     public static void main(String args[]){
    	 HouseRobber2 hr = new HouseRobber2();
    	 int[] in = {0};
    	 System.out.println(hr.rob(in));
     }
}
