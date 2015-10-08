package leetcode;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this
 * P   A   H   N
   A P L S I I G
   Y   I   R
   And then read line by line: "PAHNAPLSIIGYIR"
   Write the code that will take a string and make this conversion given a number of rows
   convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * @author pramothinidk
 *
 */
public class ZigZagConversion {
	public static String convert(String s, int numRows) {
		StringBuilder[] strb = new StringBuilder[numRows];
		for(int i=0; i<numRows ; i++)
			strb[i] = new StringBuilder();
		int j = 0;
		while(j<s.length()){
			for(int i=0; i<numRows && j<s.length() ; i++){
				strb[i].append(s.charAt(j++));
			}
			for(int x=numRows-2; x>=1 && j<s.length() ; x-- )
				strb[x].append(s.charAt(j++));
		}

		String result = "";
		for(int i=0; i<numRows; i++)
			result += strb[i];
		return result;
	}

	public static void main(String args[]){
		System.out.println(convert("ABCD",3));
	}
}
