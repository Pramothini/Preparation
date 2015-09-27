package hackerRank.string_hackerrank;


import java.util.*;

/**
 * https://www.hackerrank.com/challenges/make-it-anagram
 * Given two strings (they can be of same or different length) find out the minimum number of character deletions required to make two strings anagrams. 
 * Any characters can be deleted from any of the strings.
 * @author pramothinidk
 *
 */
public class MakeItAnagram {
	private static final int ALPHABET_COUNT = 26;

	public static int[] findAlphabetCountInStr(String str){
		int[] result = new int[ALPHABET_COUNT];
		for(int i=0; i < str.length() ; i++){
			result[str.charAt(i) - 'a']++;
		}

		return result;
	}

	public static void compareStrs(int[] result1, int[] result2){
		int delLen = 0;
		for(int i=0; i < ALPHABET_COUNT ; i++){
			delLen += ((result1[i] - result2[i] > 0) ? result1[i] - result2[i] : result2[i] - result1[i]) ;  
		}
		System.out.println(delLen);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result1 = findAlphabetCountInStr(sc.nextLine());
		int[] result2 = findAlphabetCountInStr(sc.nextLine());

		compareStrs(result1,result2);
	}
}
