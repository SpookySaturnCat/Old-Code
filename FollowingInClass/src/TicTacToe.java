/*
 * Simple Demo class to illustrate 2D arrays
 * Author: C. Williams
 * Course: CSCI 1301
 */

public class TicTacToe {

	public static void main(String[] args) {
		int[][] board1 = {
				{0, 1, 0},
				{1, 0, 1},
				{0, 0, 1}
		};

		int[][] board2 = {
				{1, 1, 0},
				{1, 1, 0},
				{1, 0, 0}
		};

		int[][] board3 = {
				{1, 0, 1},
				{0, 0, 1},
				{1, 1, 0}
		};
		
		
		// add your code here
		printBoard(board1);
		printBoard(board2);
		printBoard(board3);
	}
	
	public static void printBoard(int[][] board) 
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
//				char letter = (board[i][j] == 1? 'X' : 'O');
//				System.out.printf("%c|", letter);
				
				String bar = "";
				if (j!= board[i].length - 1) {
					bar = " | ";
				} else {
					bar = " ";
				}
				System.out.printf("%s %s ", (board[i][j] == 0) ? "O" : "X", bar);
			}
			String vertBars = "";
			if (i != board.length - 1) {
				vertBars = "-------------";
			} else {
				vertBars = "";
			}
			System.out.printf("%n%s%n", vertBars);
		}
		System.out.printf("Winner : %b%n%n", isWon(board));
	}
	/** Determine if the passed board has a winner */
	public static boolean isWon(int[][] board) {
		// check all rows for matches
		for (int i = 0; i < 3; i++)
			if ((board[i][0] == board[i][1])
					&& (board[i][1] == board[i][2])) {
				return true;
			}

		// check all columns for matches
		for (int j = 0; j < 3; j++)
			if ((board[0][j] == board[1][j])
					&& (board[1][j] == board[2][j])) {
				return true;
			}

		// check diagonals
		if ((board[0][0] == board[1][1])
				&& (board[1][1] == board[2][2])) {
			return true;
		}

		if ((board[0][2] == board[1][1])
				&& (board[1][1] == board[2][0])) {
			return true;
		}

		return false;
	}

}
