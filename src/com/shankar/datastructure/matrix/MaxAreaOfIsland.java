package com.shankar.datastructure.matrix;

public class MaxAreaOfIsland {
    /*
695. Max Area of Island
You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.



Example 1:
Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.
Example 2:

Input: grid = [[0,0,0,0,0,0,0,0]]
Output: 0


Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 50
grid[i][j] is either 0 or 1.

Input
[[1,1,0,0,0],[1,1,0,0,0],[0,0,0,1,1],[0,0,0,1,1]]
Output
0
Expected
4
     */
    public static void main(String[] args) {
//        int[][] grid={
//                {0,0,1,0,0,0,0,1,0,0,0,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,1,1,0,1,0,0,0,0,0,0,0,0},
//                {0,1,0,0,1,1,0,0,1,0,1,0,0},
//                {0,1,0,0,1,1,0,0,1,1,1,0,0},
//                {0,0,0,0,0,0,0,0,0,0,1,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,0,0,0,0,0,0,1,1,0,0,0,0}
//            };
        int[][] grid={
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,0,1,1},
                {0,0,0,1,1}
        };
        System.out.println(maxAreaOfIsland(grid));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int row = 0; row < grid.length ; row++){
            for(int col = 0; col < grid[row].length ; col++){
                //checking if in between two rows
                if(grid[row][col] == 1){
                    if((row > 0 && row < grid.length-1) && grid[row-1][col] == 1 && grid[row+1][col] ==1) {
                        area++;
                    }
                    if((col > 0 && col < grid[row].length -1) && grid[row][col-1] == 1 && grid[row][col+1] ==1){
                        area++;
                    }
                }
            }
        }
        return  area;
    }
}
