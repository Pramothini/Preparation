package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i=1 ; i<=numRows ; i++){
            List<Integer> newrow = new ArrayList<Integer>();
            for(int j=1; j<=i ; j++){
                if(j==1 || i==j){
                    newrow.add(1);
                }
                else{
//                    int left = 0;
//                    if(j-2 >= 0 && i-2 > 0)
//                        left = ;
                    newrow.add(res.get(i-2).get(j-2)+res.get(i-2).get(j-1));
                }
            }
            res.add(newrow);
            }
            return res;
        }
	public static void main(String args[]){
		PascalsTriangle pt = new PascalsTriangle();
		System.out.println(pt.generate(5));
	}
}
