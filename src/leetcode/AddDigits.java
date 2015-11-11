package leetcode;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * @author pramothinidk
 *
 */
public class AddDigits {
	
	/**
	 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
	 * @param a
	 * @param b
	 * @return
	 */
	public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int x=0; int y=0; int carry=0;
        while(a.length() != b.length()){
            if(a.length() > b.length()){
                b = "0"+b;
            }
            else{
                a = "0"+a;
            }
        }
        for(int i=a.length()-1; i>=0; i--){
            x = Character.getNumericValue(a.charAt(i));
            y = Character.getNumericValue(b.charAt(i));
            res.append((x+y+carry)%2);
            carry = (x+y+carry)/2;
        }
        
        if(carry == 1) res.append(1);
        return res.reverse().toString();
    }

	public int addDigits(int num) {
		int result = num;
		while(result/10 >= 1){
			result = getResult(result);
		}
		return result;

	}

	public int getResult(int num){
		int result = 0;
		while(num > 0){
			result += num % 10;
			num = num / 10;
		}
		return result;
	}

	public static void main(String args[]){
		AddDigits a = new AddDigits();
		System.out.println(a.addDigits(199));
		System.out.println(a.addDigits(38));
		System.out.println(a.addBinary("11","1"));
	}

}
