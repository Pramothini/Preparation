package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * A Program to sort an array of strings so that anagrams are together
 * @author pramothinidk
 *
 */
public class SortAnagramsTogether {
	public static void sortAnagramsTogether(String[] input){
		LinkedList<String> temp = new LinkedList<String>();
		HashMap<Object,LinkedList<String>> hmap = new HashMap<Object,LinkedList<String>>();
		for(int i=0; i<input.length ; i++){
			char[] chArr = input[i].toCharArray();
			Arrays.sort(chArr);
			System.out.println();
			for(int k=0;k<chArr.length;k++){
				System.out.print(chArr[k]);
			}
			if(hmap.containsKey(chArr)){
				System.out.println("I am already present");
			}
			else{
				temp.add(input[i]);
				hmap.put(chArr, temp);
				System.out.println("I am not already present");
			}
			
		}
		
	}
	
	public static void main(String args[]){
		String[] inputArray = {"apple","eppal","banana","nanaba","orange","ball"};
		sortAnagramsTogether(inputArray);
		
	}

}
