package hackerRank.string_hackerrank;

import java.util.Scanner;

/**
 * Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.
 * Your task is to find the minimum number of required deletions.
 * @author pramothinidk
 *
 */
public class AlternateChars {

	public static void checkAlternateStr(String in){
		int delLen = 0;
		if(in.length() > 1){
			char prev = in.charAt(0);
			for(int i=1 ; i < in.length() ; i++){
				if(in.charAt(i) == prev)
					delLen++;
				prev = in.charAt(i);
			}
		}
		System.out.println(delLen);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = Integer.parseInt(sc.nextLine());
		for(int i=0 ; i<total ; i++){
			checkAlternateStr(sc.nextLine());
		}
	}
}

