package leetcode;

import java.util.Stack;

public class ValidParanthesis {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length() ; i++){
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
				stack.push(s.charAt(i));
			else if(stack.isEmpty() || s.charAt(i) != inverse(stack.pop()))
				return false;
		}
		if(stack.isEmpty())
			return true;
		else
			return false;

	}

	public static Character inverse(Character c){
		Character a = null;
		if(c == '(')
			a = ')';
		else if(c == '{')
			a = '}';
		else if(c == '[')
			a = ']';
		return a;
	}

	public static void main(String args[]){
		System.out.println(isValid("({})[]"));
	}
}
