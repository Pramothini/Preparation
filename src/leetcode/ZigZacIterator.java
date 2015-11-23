package leetcode;

import java.util.ArrayList;
import java.util.List;
/**
 * Given two 1d vectors, implement an iterator to return their elements alternately.

For example, given two 1d vectors:

v1 = [1, 2]
v2 = [3, 4, 5, 6]
By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1, 3, 2, 4, 5, 6].
https://leetcode.com/problems/zigzag-iterator/
 * @author pramothinidk
 *
 */
public class ZigZacIterator {
	List<Integer> v1;
    List<Integer> v2;
    int v1in = 0;
    int v2in = 0;
    boolean v1turn = true;
    public ZigZacIterator(List<Integer> v1, List<Integer> v2) {
            this.v1 = v1;
            this.v2 = v2;
    }

    public int next() {
        if((v1turn || v2in >= v2.size() )&& v1in < v1.size()){
            v1turn = false;
            return v1.get(v1in++);
        }
        else if(v1in >= v1.size() || v2in < v2.size()){
            v1turn = true;
            return v2.get(v2in++);
        }
        return -1;
    }

    public boolean hasNext() {
        return ( v1in < v1.size() || v2in < v2.size());
    }
    
    public static void main(String args[]){
    	List<Integer> v1 = new ArrayList<Integer>();
        List<Integer> v2 = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        v1.add(1);
        v1.add(2);
        v2.add(3);
        v2.add(4);
        v2.add(5);
        v2.add(6);
        
        ZigZacIterator i = new ZigZacIterator(v1, v2);
         while (i.hasNext()) ans.add(i.next());
         
         System.out.println(ans);
    }
}
