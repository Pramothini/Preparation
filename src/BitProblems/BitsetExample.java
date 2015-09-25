package BitProblems;

import java.util.BitSet;

/**
 * Class to identify the duplicates in an int[] and in a string
 * @author pramothinidk
 *
 */
public class BitsetExample {
	BitSet bs = new BitSet(10);
	BitSet bsChar = new BitSet(52);

	public void findDuplicate(int[] a){
		for(int i=0; i<a.length ; i++)
			if(!bs.get(a[i])){
				bs.set(a[i]);
			}
			else
				System.out.println(" the duplicate element is "+a[i]);
	}

	public void findDuplicate(String a){
		for(int i=0; i<a.length() ; i++){
			int s = a.charAt(i) - 'A';
			if(!bsChar.get(s)){
				bsChar.set(s);
			}
			else
				System.out.println(" the duplicate element is "+a.charAt(i));
		}
	}

	public static void main(String args[]){
		BitsetExample be = new BitsetExample();
		int findduplicates[] = {1,2,3,4,2,3,4,5,1,12};
		be.findDuplicate(findduplicates);
		String findDuplicate = "AappleAZZPSzz";
		be.findDuplicate(findDuplicate);
	}
}
