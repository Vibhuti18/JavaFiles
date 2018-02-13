package com.psl.tictactoe;

public class TicTacToe {

	public char grid[][] = new char[5][5];
	public int[] check = new int[15];
	public int unique, turn;

	public TicTacToe() {
		// TODO Auto-generated constructor stub

		for (int i = 1; i <= 9; i++)
			check[i] = 0;
	}

	public void checkFreeCell() {

		int r, c;
		for (int i = 1; i <= 9; i++) {

			do {
				unique = 0;
				turn = i;
				r = 1 + (int) (Math.random() * 3);
				c = 1 + (int) (Math.random() * 3);

				if (check[(r - 1) * 3 + c] == 0) {
					unique = 1;
				}

			} while (unique == 0);
			check[(r - 1) * 3 + c] = 1;
			if (turn % 2 == 1) {
				grid[r][c] = 'O';
			} else
				grid[r][c] = 'X';

			/*
			 * for (int u = 1; u <= 9; u++) System.out.print(check[u]);
			 * 
			 * System.out.print(" ");
			 */
		}
	}

	public void checkWinner() {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println("");
		}

		if (grid[1][1] == 'O' && grid[1][2] == 'O' && grid[1][3] == 'O')
			System.out.println("Player 1 wins");
		else if (grid[2][1] == 'O' && grid[2][2] == 'O' && grid[2][3] == 'O')
			System.out.println("Player 1 wins");
		else if (grid[3][1] == 'O' && grid[3][2] == 'O' && grid[3][3] == 'O')
			System.out.println("Player 1 wins");
		else if (grid[1][1] == 'O' && grid[2][1] == 'O' && grid[3][1] == 'O')
			System.out.println("Player 1 wins");

		else if (grid[1][2] == 'O' && grid[2][2] == 'O' && grid[3][2] == 'O')
			System.out.println("Player 1 wins");
		else if (grid[1][3] == 'O' && grid[2][3] == 'O' && grid[3][3] == 'O')
			System.out.println("Player 1 wins");

		// player 2 cases

		else if (grid[1][1] == 'X' && grid[1][2] == 'X' && grid[1][3] == 'X')
			System.out.println("Player 1 wins");
		else if (grid[2][1] == 'X' && grid[2][2] == 'X' && grid[2][3] == 'X')
			System.out.println("Player 1 wins");
		else if (grid[3][1] == 'X' && grid[3][2] == 'X' && grid[3][3] == 'X')
			System.out.println("Player 1 wins");
		else if (grid[1][1] == 'X' && grid[2][1] == 'X' && grid[3][1] == 'X')
			System.out.println("Player 1 wins");

		else if (grid[1][2] == 'X' && grid[2][2] == 'X' && grid[3][2] == 'X')
			System.out.println("Player 1 wins");
		else if (grid[1][3] == 'X' && grid[2][3] == 'X' && grid[3][3] == 'X')
			System.out.println("Player 1 wins");
		else
			System.out.println("Its a draw");

	}

	public static void main(String args[]) {

		TicTacToe t = new TicTacToe();
		t.checkFreeCell();
		t.checkWinner();

	}

}
