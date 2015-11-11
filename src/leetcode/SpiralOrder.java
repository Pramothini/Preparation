package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * 
 * For example,
Given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].
 * @author pramothinidk
 *
 */
public class SpiralOrder {
	 public List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> res = new ArrayList<Integer>();
	        if(matrix.length == 0) return res;
	        int rowstart = 0;
	        int rowend = matrix.length-1;
	        int colstart = 0;
	        int colend = matrix[0].length-1;
	        while(rowstart <= rowend && colstart <= colend){
	            //right
	            for(int i=colstart ; i<=colend; i++){
	                res.add(matrix[rowstart][i]);
	            }
	            
	            rowstart++;

	            //down
	            for(int i=rowstart ; i<=rowend; i++){
	                res.add(matrix[i][colend]);
	            }
	            
	            colend--;

	            //left
	            if(colstart <= colend && rowstart <= rowend)
	            for(int i=colend ; i>=colstart;i--){
	                res.add(matrix[rowend][i]);
	            }
	            
	            rowend--;
	            
	            //up
	            if(colstart <= colend && rowstart <= rowend)
	            for(int i=rowend; i>=rowstart ; i--){
	                res.add(matrix[i][colstart]);
	            }
	            
	            colstart++;
	            
	            
	        }
	        
	        return res;
	        
	    }
	 
	 public static void main(String args[]){
		 SpiralOrder sp = new SpiralOrder();
		 int[][] i = {{1,2,3},{4,5,6},{7,8,9}};
		 System.out.println(sp.spiralOrder(i));
	 }
}
