package sorting;
/**
 * Problem : You are given two sorted arrays A and B
 * A has space for B in the end
 * Merge them together
 * @author pramothinidk
 *
 */
public class MergeASortedArrayIntoAnother {
	
	public static void merge(int[] a,int[] b, int lastA,int lastB){
		int fullLength = a.length - 1;
		while(lastA < fullLength && lastB < fullLength)
		if(a[lastA] > b[lastB])
			a[fullLength--] = a[lastA--];
		else
			a[fullLength--] = b[lastB--];
	}

	public static void main(String args[]){
		int temp[] = {10,13,15,20,25};
		int b[] = {12,14,16,17,22};
		int a[] = new int[temp.length + b.length];
		for(int i=0; i<temp.length; i++){
			a[i] = temp[i];
		}
		merge(a,b,temp.length - 1,b.length - 1);
		for(int i=0 ; i< a.length ; i++)
		System.out.println( a[i]);
		
//		output:
//		10
//		12
//		13
//		14
//		15
//		16
//		17
//		20
//		22
//		25
		
		
	}
}
