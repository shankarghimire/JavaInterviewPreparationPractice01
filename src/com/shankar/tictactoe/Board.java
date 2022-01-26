package com.shankar.tictactoe;

public class Board {
    private char[][] boards;
    public Board(){
        boards = new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','9'}};

    }
    public void printBoard(){
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if(col == 1){
                    System.out.print("|"+ boards[row][col] + "|");
                }else{
                    System.out.print( boards[row][col]);
                }
            }
//            System.out.println();
            System.out.println("\n_______________");
        }
    }
}
