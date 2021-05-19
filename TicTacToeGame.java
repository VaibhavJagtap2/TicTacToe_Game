package com.tictactoegame;
import java.util.Scanner;

public class TicTacToeGame {
	
	private static char[] CreateBoard() {
        char[] board = new char[9];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
                    
	 private static char UserLetter(){
			Scanner scan = new Scanner(System.in);
		 	System.out.println("Enter choice X or O");
		 	char UserLetter = scan.next().charAt(0);
		 	return UserLetter;
	 }

public static void main(String[] args) {
System.out.println("WELCOME TO THE TIC_TAC_TOE_GAME");
char[] board=CreateBoard();
UserLetter();
}
}
