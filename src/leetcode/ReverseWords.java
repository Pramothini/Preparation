package leetcode;
/**
 * Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
 * @author pramothinidk
 *
 */
public class ReverseWords {
	public String reverseWords(String s) {
        String[] in = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=in.length-1 ; i>=0 ; i--){
            sb.append(in[i]);
            if(in[i].length() >0)
                sb.append(" ");
        }
        return sb.toString().trim();
    }
	
	public static void main(String args[]){
		ReverseWords rw = new ReverseWords();
		System.out.println(rw.reverseWords("  a  b"));
		
	}
}
