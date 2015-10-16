package leetcode.binarytreepractise;

public class BSTRotatedSortedArray {

	public int search(int[] nums, int target) {
		if(nums.length==0)
			return -1;
		int l=0, r = nums.length-1, m=0;
		while(l<=r)
		{
			m = l + (r-l)/2;
			if(nums[m] == target)
				return m;
			else
			{
				// if right side is sorted
				if(nums[m] < nums[r])  
				{
					// is it in the right side?
					if(nums[m]<target && target <= nums[r])
						l = m+1;
					else
						r = m-1;
				}
				// left sided is sorted
				else
				{
					// is target in left side?
					if(nums[l]<=target && target < nums[m])
						r = m-1;
					else
						l = l+1;
				}
			}
		}
		return -1;
	}



	public static void main(String args[]){
		BSTRotatedSortedArray bst = new BSTRotatedSortedArray();
		int[] i ={10,12,1,2,3,4,5,6,7,9};
		System.out.println(bst.search(i, 2));

	}
}
