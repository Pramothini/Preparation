package hackerRank.string_hackerrank;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/anagram/copy-from/14122569
 * Sid is obsessed with reading short stories. Being a CS student, he is doing some interesting frequency analysis with the books. He chooses strings S1 and S2 in such a way that |len(S1)−len(S2)|≤1.
 * Your task is to help him find the minimum number of characters of the first string he needs to change to enable him to make it an anagram of the second string.
 * 
 * 
 * NOTE:
 * Syntax of substring:
 * public String substring(int beginIndex) or
 * public String substring(int beginIndex, int endIndex)
 * 
 * beginIndex -- the begin index, INCLUSIVE.
 * endIndex -- the end index, EXCLUSIVE.
 * 
 * @author pramothinidk
 *
 */
public class Anagram {
	private static final int ALPHABET_COUNT = 26;

	public static void findAnagramReplacementNo(String str){
		if(str.length() % 2 != 0 ){
			System.out.println(-1);
		}
		else{
			//System.out.println(str.substring(0,(str.length() / 2)));
			//System.out.println(str.substring(str.length() / 2 ));
			int[] result1 = findAlphabetCountInStr(str.substring(0,(str.length() / 2)));
			int[] result2 = findAlphabetCountInStr(str.substring(str.length() / 2 ));
			compareStrs(result1,result2);
		}


	}

	public static int[] findAlphabetCountInStr(String str){
		int[] result = new int[ALPHABET_COUNT];
		for(int i=0; i < str.length() ; i++){
			result[str.charAt(i) - 'a']++;
		}
		return result;
	}

	public static void compareStrs(int[] result1, int[] result2){
		int chgLen = 0;
		for(int i=0; i < ALPHABET_COUNT ; i++){
			chgLen += ((result1[i] - result2[i] > 0) ? (result1[i] - result2[i]) : 0) ;  
		}
		System.out.println(chgLen);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfStrs = Integer.parseInt(sc.nextLine());
		for(int i=0 ; i<noOfStrs ; i++){
			findAnagramReplacementNo(sc.nextLine());
		}
	}
}

