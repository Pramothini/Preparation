package leetcode;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 * @author pramothinidk
 *
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        for(int i=0, j = s.length()-1 ; i < j ; i++,j--){
            while(i < j && ! Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i < j && ! Character.isLetterOrDigit(s.charAt(j))) j--;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }
        return true;
    }
	
	public static void main(String args[]){
		ValidPalindrome v = new ValidPalindrome();
		System.out.println(v.isPalindrome("A man, a plan, a canal: Panama"));
	}
}
