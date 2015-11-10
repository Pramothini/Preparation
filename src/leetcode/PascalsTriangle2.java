package leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].
 * @author pramothinidk
 *
 */
public class PascalsTriangle2 {
	public List<Integer> getRow(int rowIndex) {
    Integer[] row = new Integer[rowIndex+1];
    Integer[] result = new Integer[rowIndex+1];
    for(int i=0 ; i<=rowIndex ; i++){
        int j=0;
        while(j<=i){
            if(j==0 || j==i){
                row[j] = 1;
            }
            else{
                row[j] = result[j]+result[j-1];
            }

            j++;
        }
        for(int x=0 ;x<=i ; x++){
        	result[x] = row[x];
        }
    }
    return Arrays.asList(row);	

	}
	
	 public static void main(String args[]){
		 PascalsTriangle2 pt = new PascalsTriangle2();
		 System.out.println(pt.getRow(3));
		 
	 }
}
