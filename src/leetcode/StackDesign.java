package leetcode;

import java.util.ArrayList;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element
 * @author pramothinidk
 *
 */
public class StackDesign {
	 ArrayList<Integer> arrlist = new ArrayList<Integer>();
	    int min = Integer.MAX_VALUE;
	    int top = -1;
	    public void push(int x) {
	        arrlist.add(x);
	        if (x<min) 
	            min = x;
	        top++;
	    }

	    public void pop() {
	        arrlist.remove(top);
	        top--;
	        
	    }

	    public int top() {
	       return arrlist.get(top);
	    }

	    public int getMin() {
	        int min = Integer.MAX_VALUE;
	        for(int i=0 ; i<arrlist.size() ; i++){
	            if(min > arrlist.get(i))
	                min = arrlist.get(i);
	        }
	        return min;
	        
	    }
	    
	    public static void main(String args[]){
	    	StackDesign sd = new StackDesign();
	    	sd.push(1);
	    	sd.push(2);
	    	sd.push(20);
	    	
	    	System.out.println("Min element"+sd.getMin());
	    	System.out.println("top element"+sd.top());
	    	sd.pop();
	    	System.out.println("Min element"+sd.getMin());
	    	System.out.println("top element"+sd.top());
	    }

}
