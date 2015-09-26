package sorting_hackerrank;

import java.util.*;


public class InsertionClassPart1 {

	/**
	 * Given a sorted list with an unsorted number V in the rightmost cell, can you write some simple code to insert V into the array so that it remains sorted?
	 * Print the array every time a value is shifted in the array until the array is fully sorted. The goal of this challenge is to follow the correct order of insertion sort.
	 * @author pramothinidk
	 * Sample input - 5
	                  2 4 6 8 3
	 * Sample output :
	 * 2 4 6 8 8 
	   2 4 6 6 8 
	   2 4 4 6 8 
	   2 3 4 6 8 
	 */
	public static void insertIntoSorted(int[] ar) {
		if(ar!= null && ar.length > 1){
			int temp = ar[ar.length -1];
			for(int i=ar.length - 2 ; i >= 0 ; i--){
				if(ar[i] > temp){
					ar[i+1] = ar[i];
					printArray(ar);
					if(i == 0)
						ar[i] = temp;
				}
				else{
					ar[i+1] = temp;
					break; 
				}
			}
		}
		printArray(ar);

	}


	//original insertion sort
	/**
	 * requires a constant amount O(1) of additional memory space
	 * @param ar
	 */
	public static void insertionSortPart2(int[] ar)
	{       
		if(ar!= null && ar.length > 1){
			for(int length = 1 ; length < ar.length  ; length++ ){
				int temp = ar[length];
				for(int i=length - 1 ; i >= 0 ; i--){
					if(ar[i] > temp){
						ar[i+1] = ar[i];
						if(i == 0)
							ar[i] = temp;
					}
					else{
						ar[i+1] = temp;
						break; 
					}
				}
				printArray(ar);
			}
		}

	} 

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertIntoSorted(ar);
		System.out.println();
		insertionSortPart2(ar);
	}


	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}




}




