
/**
 * Finds whether the given string contains all unique characters or not
 * @author pramothinidk
 *
 */
public class UniqueCharsInString {

public static void main(String[] args){
String a = "King".toLowerCase();
System.out.println(" Is the string contain all unique chars ? "+ UniqueCharsInString.isUnique(a));
}

/**
 * Finds the position of each character of the given string in the alphabet. eg: a = 0, b=1 , c=2, etc..
 * Tries to set the nth bit for the nth position of the character
 * If a bit is already set in that position, it means that the character has already appeared and returns false
 * If all the positions for all the characters in the given string is set, then all are unique characters and returns a true
 * @param a
 * @return
 */
static boolean isUnique(String a){
	int check = 0;
	for(int i=0 ; i<a.length() ; i++){
		int pos = a.charAt(i) - 'a';
		System.out.println("pos of char at "+i+" is  :"+pos);
		if( (check & (1 << pos)) != 0 ){
			return false;
		}
		else{
			check = check | (1 << pos);
		}
		
	}
	return true;
	
}


}
