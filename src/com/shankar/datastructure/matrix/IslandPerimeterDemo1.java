package com.shankar.datastructure.matrix;

public class IslandPerimeterDemo1 {
    public static void main(String[] args) {
//        int[][] grid = {
//                {0,1,0,0},
//                {1,1,1,0},
//                {0,1,0,0},
//                {1,1,0,0}
//            };
        int[][] grid = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        int perimeter = findIslandPerimeter(grid);
        System.out.println("Perimeter of Island: " + perimeter);
    }
    public  static  int findIslandPerimeter(int[][] grid){
        int perimeter = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length;col++){
                if(grid[row][col] == 1){
                    perimeter += 4;
                    //subtracting if connected with up box
                    if( row > 0 && grid[row-1][col] == 1){
                        perimeter -= 2;
                    }
                    //subtract sides if connected with left box
                    if( col > 0 && grid[row][col-1] == 1){
                        perimeter -= 2;
                    }
                }
            }
        }
        return  perimeter;
    }
}
