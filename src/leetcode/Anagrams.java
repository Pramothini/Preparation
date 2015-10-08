package leetcode;

/**
 * https://leetcode.com/problems/valid-anagram/
 * Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.
 * @author pramothinidk
 *
 */
public class Anagrams {
	public boolean isAnagram(String s, String t) {
	 int[] bs = new int[26];
     int[] bs2 = new int[26];
     if(s.length() != t.length())
         return false;
     for(int i=0; i<s.length() ; i++)
         bs[s.charAt(i) - 'a']++;
     
     for(int x=0; x<t.length() ; x++){
         bs2[t.charAt(x) - 'a']++;
     }
         
     for(int j=0; j<26 ; j++){   
         if(bs[j] != bs2[j])
             return false;
     }
     
     return true;
	}
	
	public static void main(String args[]){
		Anagrams a = new Anagrams();
		System.out.println(a.isAnagram("ab", "ba"));
	}
     
}
