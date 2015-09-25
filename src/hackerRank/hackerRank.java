package hackerRank;

import java.util.Scanner;

/**
 * Program to draw a staircase of height N in the format given below.
 * 
 * 5
    #
   ##
  ###
 ####
#####
 * @author pramothinidk
 *
 */
public class hackerRank {

	public static void generateStaircase(int input){
		for(int i=1; i<=input ; i++){
			int j=input;
			while(j>=1){
				if(j<=i)
					System.out.print("#");
				else
					System.out.print(" ");
				j--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		generateStaircase(input);
	}
}


