package com.shankar.dynamicprogramming;

/*
Say that you are a traveller on a 2d grid. You begin in the top-left corner
and your goal is to travel to the bottom-right corner.
You may only move down or right.
In how many ways can you travel to the goal on a grid with
dimensions m*n?
 */
public class GridTravellerDemo1 {
    private int row;
    private  int col;
    private  long result;
    public long gridTraveller(int row, int col){

//        if(row ==1 && col == 1){
//            return 1;
//        }
//        if(row == 0 || col == 0){
//            return 0;
//        }
//        return gridTraveller(row-1, col) + gridTraveller(row, col-1);
        //call helper method
        gridTravellerHelper(row, col);
        return  result;
    }
//    //Helpermethod
    private void gridTravellerHelper(int row, int col){
        if(row == 0 || col == 0){
            return ;
        }
        if(row ==1 && col == 1){
            result += 1;
        }
        gridTravellerHelper(row-1, col);
        gridTravellerHelper(row, col-1);
    }
    public static void main(String[] args) {
        GridTravellerDemo1 gt1 = new GridTravellerDemo1();
        System.out.println(gt1.gridTraveller(1,1));
        System.out.println(gt1.gridTraveller(2,3));
        System.out.println(gt1.gridTraveller(5,5));
        System.out.println(gt1.gridTraveller(10,10));
        System.out.println(gt1.gridTraveller(18,18));
    }
}
