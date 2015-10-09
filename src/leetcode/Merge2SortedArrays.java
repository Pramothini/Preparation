package leetcode;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
	Note:
	You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. 
	The number of elements initialized in nums1 and nums2 are m and n respectively.
 * @author pramothinidk
 *
 */
public class Merge2SortedArrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if(n == 0){
            return;
        }
        
        if(m == 0){
            for(int i = 0 ; i<n ; i++)
                nums1[i] = nums2[i];
            return;
        }
        
        for(int i = nums1.length-1,j=n-1 ,k=m-1 ; i>=0 && j>=0; i--){
          nums1[i] = (k >=0 && nums1[k] > nums2[j]) ? nums1[k--] : nums2[j--];
        }
        
        return;
        
        
    }
	
	
	public static void main(String args[]){
		Merge2SortedArrays me = new Merge2SortedArrays();
		int[] nums1 = {2,0};
		int[] nums2 = {1};
		me.merge(nums1, 1, nums2, 1);
		for(int i=0 ; i<nums1.length ; i++){
			System.out.println(nums1[i]);
		}
	}
}
