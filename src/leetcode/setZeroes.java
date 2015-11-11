package leetcode;

public class setZeroes {

	/**
	 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
	 * @param matrix
	 */
    public void setZeroe(int[][] matrix) {
        if(matrix.length == 0) return;
        int rowlen = matrix.length-1;
        int collen = matrix[0].length-1;
        for(int r=0; r<=rowlen ; r++){
            for(int c=0 ; c<=collen ; c++){
                if(matrix[r][c] == 0)
                    mutate(matrix,r,c);
            }
        }
        
        for(int r=0; r<=rowlen ; r++){
            for(int c=0 ; c<=collen ; c++){
                if(matrix[r][c] == Integer.MIN_VALUE+4)
                    matrix[r][c] = 0;
            }
        }
    }
    
    void mutate(int[][] matrix,int r, int c){
        for(int col=0; col<=matrix[0].length-1 ; col++){
            if(matrix[r][col]!=0)
                matrix[r][col] = Integer.MIN_VALUE+4;
        }
        for(int row=0; row <=matrix.length-1 ; row++ ){
            if(matrix[row][c]!=0)
                matrix[row][c] = Integer.MIN_VALUE+4;
        }
}
    public static void main(String args[]){
    	setZeroes sp = new setZeroes();
		 int[][] i = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
		 sp.setZeroe(i);
	 }
}
