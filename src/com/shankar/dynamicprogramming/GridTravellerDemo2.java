package com.shankar.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class GridTravellerDemo2 {
    private int row;
    private  int col;
    private  long result;
    private static Map<String, Long> map = new HashMap<>();
    private int count = 0;

    public long gridTraveller(int row, int col){
        //without using helper method
        String key = row +"," + col;
        if(map.containsKey(key)){
//            System.out.println("Key:  " + key);
            return map.get(key);
        }
        if(row == 0 || col == 0){
            return 0;
        }
        if(row ==1 && col == 1){
            return 1;
        }
        result = gridTraveller(row-1, col) + gridTraveller(row, col-1);
        map.put(key, result);
        return map.get(key);

        //using Helper method
//        gridTravellerHelper(row, col);
//        return  result;
    }
    //    //Helpermethod
    private void gridTravellerHelper(int row, int col){
        String key = row + "," + col;
        if(map.containsKey(key)){
            result = map.get(key);
            return;
        }
        if(row == 0 || col == 0){
            return ;
        }
        if(row ==1 && col == 1){
            result += 1;
            return;
        }
       gridTravellerHelper(row-1, col);
        gridTravellerHelper(row, col-1);
        map.put(key, result);
    }
    public static void main(String[] args) {
        GridTravellerDemo2 gt1 = new GridTravellerDemo2();
        //System.out.println(gt1.gridTraveller(1,1));
        System.out.println(gt1.gridTraveller(3,3));
//        System.out.println(map);
//        System.out.println(gt1.gridTraveller(5,5));
//        System.out.println(gt1.gridTraveller(10,10));
        long start  = System.currentTimeMillis();
        System.out.println(gt1.gridTraveller(10,10));
        double duration = (System.currentTimeMillis() - start)/ 1000.0;
        System.out.println("Elasped Time: " + duration);
    }
}
