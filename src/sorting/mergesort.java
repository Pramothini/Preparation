package sorting;

/**
 * needs more work - incomplete
 * @author pramothinidk
 *
 */
public class mergesort {

	public void mergesrt(int a[],int temp[],int left,int right){
		if(left < right){
			int middle = (left+right)/2;
//			System.out.println("middle is "+middle);
			mergesrt(a,temp,left,middle);
			mergesrt(a,temp,middle+1,right);
			merge(a,temp,left,middle,right);
		}
		//		for(int i=0;i<temp.length;i++){
		//			System.out.println(temp[i]);
		//		}
	}
	public void merge(int a[],int temp[],int leftEnd,int middle,int rightEnd){
		int current = leftEnd;
		int right = middle+1;
		while((leftEnd <= middle) && (right <= rightEnd)) 
		{	
			if(a[leftEnd] <= a[right]){
				System.out.println("left is "+leftEnd+ "and temp["+current+"] is"+a[leftEnd]);
				
				temp[current] = a[leftEnd];
				leftEnd++;
			}
			else{
				System.out.println("right is "+ right + "and temp["+current+"] is"+a[right]);
				temp[current] = a[right];
				right++;
			}
			current++;
		}
		int remaining = middle - leftEnd;
		for(int i=0;i<=remaining;i++){
			temp[current + i] = a[leftEnd + i];
		}

	}
	public static void main(String args[]){
		mergesort m = new mergesort();
		int[] a = {12,6,2,5,1,8,7,10};
		int[] tmp = {12,6,2,5,1,8,7,10};
		m.mergesrt(a,tmp,0,a.length-1);
		for(int i=0;i<tmp.length;i++){
			System.out.println(tmp[i]);
		}


	}
}




//import java.util.*;
//
//public class mergesort
//{
//	public static void main(String[] args)
//	{
//		Integer[] a = {2, 6, 3, 5, 1};
//		mergeSort(a);
//		System.out.println(Arrays.toString(a));
//	}
//
//	public static void mergeSort(Comparable [ ] a)
//	{
//		Comparable[] tmp = new Comparable[a.length];
//		mergeSort(a, tmp,  0,  a.length - 1);
//	}
//
//
//	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
//	{
//		if( left < right )
//		{
//			int center = (left + right) / 2;
//			mergeSort(a, tmp, left, center);
//			mergeSort(a, tmp, center + 1, right);
//			merge(a, tmp, left, center + 1, right);
//		}
//	}
//
//
//    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
//    {
//        int leftEnd = right - 1;
//        int k = left;
//        int num = rightEnd - left + 1;
//
//        while(left <= leftEnd && right <= rightEnd)
//            if(a[left].compareTo(a[right]) <= 0)
//                tmp[k++] = a[left++];
//            else
//                tmp[k++] = a[right++];
//
//        while(left <= leftEnd)    // Copy rest of first half
//            tmp[k++] = a[left++];
//
//        while(right <= rightEnd)  // Copy rest of right half
//            tmp[k++] = a[right++];
//
//        // Copy tmp back
//        for(int i = 0; i < num; i++, rightEnd--)
//            a[rightEnd] = tmp[rightEnd];
//    }
// }
