package leetcode;
/**
 * Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * @author pramothinidk
 *
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(k > nums.length){
            k-=nums.length;
        }
        if(k!=0){
            reverse(nums,0,nums.length-k-1);
            reverse(nums,nums.length-k,nums.length-1);
            reverse(nums,0,nums.length-1);
        }
    }
    
    void reverse(int[] nums,int start, int end){
        for(int i=start,j=end;i<((start+end)/2) && j<=end; i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }


    public static void main(String args[]){
    	int[] in = {1,2,3,4,5,6,7};
    	RotateArray ra = new RotateArray();
    	ra.rotate(in, 3);
    	for(int x : in){
    		System.out.print(x + " ");
    		//output : 
        	//5 6 7 1 2 3 4 
    	}
    	
    	
    }
}
