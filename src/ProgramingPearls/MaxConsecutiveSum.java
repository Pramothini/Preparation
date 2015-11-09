package ProgramingPearls;

public class MaxConsecutiveSum {

	public void getMaxSum(int[] input){
		int maxsofar = input[0];
		int maxendinghere = input[0];
		for(int i=1;i<input.length;i++){
			maxendinghere = Math.max(maxendinghere + input[i] , input[i]);
			maxsofar = Math.max(maxendinghere, maxsofar);
		}
		System.out.println("max sum is "+maxsofar);
	}
	
	public static void main(String args[]){
		MaxConsecutiveSum ms = new MaxConsecutiveSum();
		int[] input = {31,-41,59,26,-53,58,97,-93,-23,84};
		//int[] input = {31,-41,59,26,-53,58,97,-93,-23,84};
		ms.getMaxSum(input);
	}
}
