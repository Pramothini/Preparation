package leetcode;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3
 * @author pramothinidk
 *
 */
public class IslandsDFS {
    int[] xPos = {-1,1,0,0};
    int[] yPos = {0,0,-1,1};
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int row=0; row<grid.length ; row++){
            for(int col = 0; col < grid[row].length ; col++){
                if(grid[row][col] == '1'){
                    islands++;
                    mutateIsland(row,col,grid);
                }
            }
        }
        return islands;
    }
    
    public void mutateIsland(int row, int col, char[][] grid){
        grid[row][col] = 'X';
        for(int i=0; i<xPos.length ; i++){
            if(row+xPos[i] >=0 && row+xPos[i] < grid.length && col+yPos[i] >= 0 && col+yPos[i] < grid[0].length && grid[row+xPos[i]][col+yPos[i]] == '1'){
                mutateIsland(row+xPos[i],col+yPos[i],grid);
            }
        }
    }
    


}
