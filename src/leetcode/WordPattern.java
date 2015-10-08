package leetcode;

import java.util.HashMap;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
 * @author pramothinidk
 *
 */
public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
		HashMap<Character,String> hm = new HashMap<Character,String>();
		String[] strinput = str.split(" ");
		if(pattern.length() != strinput.length)
			return false;
		for(int i=0 ; i < pattern.length() ; i++){
			if(hm.containsKey(pattern.charAt(i))){
				if(! hm.get(pattern.charAt(i)).equals(strinput[i]))
					return false;
			}
			else if( ! hm.containsValue(strinput[i]))
				hm.put(pattern.charAt(i) , strinput[i]);
			else
				return false;
		}

		return true;
	}

	public static void main(String args[]){
		System.out.println(wordPattern("abba","dog dog dog dog"));
		System.out.println(wordPattern("abba","dog fish fish dog"));
	}
}
