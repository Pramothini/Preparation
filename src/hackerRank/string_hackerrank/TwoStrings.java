package hackerRank.string_hackerrank;

import java.util.*;

/**
 * You are given two strings, A and B. Find if there is a substring that appears in both A and B.
 * https://www.hackerrank.com/challenges/two-strings/copy-from/14174238
 * @author pramothinidk
 *
 */
public class TwoStrings {

	public static void isSubstring(String str1,String str2){
		BitSet bs = new BitSet(26);
		for(int i=0 ; i<str1.length() ; i++){
			bs.set(str1.charAt(i) - 'a');
		}

		for(int i=0 ; i<str2.length() ; i++){
			if(bs.get(str2.charAt(i) - 'a')){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfCases = Integer.parseInt(sc.nextLine());
		for(int i=0 ; i<noOfCases ; i++){
			isSubstring(sc.nextLine(),sc.nextLine());
		}

	}
}

