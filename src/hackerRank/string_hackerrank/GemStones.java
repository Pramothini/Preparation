package hackerRank.string_hackerrank;

import java.util.*;

/**
 * 
 * John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lower-case Latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a gem-element if it occurs at least once in each of the rocks.
 Given the list of N rocks with their compositions, display the number of gem-elements that exist in those rocks.
 * @author pramothinidk
 *
 */
public class GemStones {

	public static void findgems(String[] gems){
        int gemcount = 0;
        
        if(gems.length >= 1 && gems.length <= 100){
            
            int[] hasgem = new int[26];
            for(int i=0 ; i< gems.length ; i++){
                for(int j=0 ; j<gems[i].length() ; j++){
                  //System.out.println( (int)gems[i].charAt(j) - 'a'); 
                    if( hasgem[gems[i].charAt(j) - 'a'] == i)
                       hasgem[gems[i].charAt(j) - 'a']++;
                }
            }
            
            for(int i=0 ; i<hasgem.length ; i++){
               // System.out.println(hasgem[i]);
                if(hasgem[i] == gems.length){
                    gemcount++;
                }
            }
            
           
            
        }
         System.out.println(gemcount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfRocks = Integer.parseInt(sc.nextLine());
        String[] gems = new String[noOfRocks];
        for(int i=0 ; i<noOfRocks ; i++){
            gems[i] = sc.nextLine();
        }
        
        findgems(gems);
    }
}
