package leetcode;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * @author pramothinidk
 *
 */
public class AddDigits {
	
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
    }

}
