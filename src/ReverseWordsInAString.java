import java.util.Scanner;

/**
 * reverse the words in a string entered via console
 * Eg: how are you - uoy era woh
 * @author pramothinidk
 *
 */
public class ReverseWordsInAString {
	public void reverseWords(String input){
		String[] original = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = (original.length - 1) ; i >= 0 ; i--){
			sb.append(reverseCharacters(original[i])).append(" ");
		}
		System.out.println("the reversed string - "+ sb);
		
		//output:
		//how are you
		//the reversed string - uoy era woh 
	}
	
	public StringBuilder reverseCharacters(String input){
		StringBuilder sb = new StringBuilder();
		for(int i=input.length() - 1 ; i>=0 ; i--){
			sb.append(input.charAt(i));
		}
		return sb;
	}

	public static void main(String args[]){
		ReverseWordsInAString rstr = new ReverseWordsInAString();
		Scanner sc = new Scanner(System.in);
		int intin = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		rstr.reverseWords(input);
	}

}
