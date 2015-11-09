package leetcode;

public class SingleNumber3 {
	public int[] singleNumber(int[] nums) {
        int exoredresult = 0;
        int[] result = {0,0};
        for(int i=0; i<nums.length ; i++){
            exoredresult ^= nums[i];
        }
        int posOfOne=0;
        for( ; posOfOne<=31 ; posOfOne++){
            if((exoredresult & (1<<posOfOne)) == (1<<posOfOne))
              break;  
        }
        for(int i=0; i<nums.length ; i++){
            if((nums[i] & (1<<posOfOne)) == (1<<posOfOne))
                result[0] ^= nums[i];
            else
                result[1] ^= nums[i];
        }
        
        return result;
    }
	
	public static void main(String args[]){
		int[] a = {1,1,3,2,5,2};
		SingleNumber3 sn = new SingleNumber3();
		int[] res = sn.singleNumber(a);
		System.out.println(res[0]+"     "+res[1]);
	}
}
