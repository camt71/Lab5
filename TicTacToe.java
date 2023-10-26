package lab5;


public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;

	public TicTacToe(char[][] board) {
		this.board = board;
	}

	// Task 2.1
	/*
	 * This method checks all rows and returns true if any of them are marked with
	 * all of a single player's markers. Otherwise, returns false. kiem tra hang
	 3x3*/
	public boolean checkRows() {
		for (int i = 0; i < board.length; i++) {// row
			char check = board[i][0];
			if (check != EMPTY) {
				for (int k = 1; k < board[0].length; k++) {// col
					if (board[i][k] != check)// neu khong bang check thi chay hang khac
						break;
					if (k == board[0].length - 1)// xet toi phan tu cuoi cung thi ngung
						return true;
				}
			}
		}
		return false;
	}

// Task2.2
	/*
	 * This method checks all columns and returns true if any of them are marked
	 * with all of a single player's. Otherwise, returns false.
	 3x3*/
	public boolean checkColumns() {
		for (int i = 0; i < board[0].length; i++) {// col
			char check = board[0][i];
			if (check != EMPTY) {
				for (int j = 1; j < board.length; j++) {// row
					if (board[j][i] != check)// neu khong bang check thi chay cot khac
						break;
					if (j == board.length - 1)// xet toi phan tu cuoi cung thi ngung
						return true;
				}
			}
		}
		return false;

	}

// Task 2.3
	/*
	 * This method checks both diagonals and returns true if any of them are marked
	 * with all of a single player's markers. Otherwise, returns false.
	 3x3*/
	public boolean checkDiagonals() {
		// Check top-left to bottom-right(duong cheo chinh)
		char check1 = board[0][0];
		if (check1 != EMPTY) {
			for (int i = 1; i < board.length; i++) {
				if (board[i][i] != check1)
					break;
				if (i == board.length - 1)// chay den phan tu cuoi
					return true;
			}

		}
		// Check bottom-left to top-right(duong cheo phu)
		char check2 = board[0][board[0].length - 1];
		if (check2 != EMPTY) {
			for (int i = 1; i < board.length; i++) {
				if (board[i][board.length - i - 1] != check2)
					return false;
				if (i == board.length - 1)// chay den phan tu cuoi
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		char[][] arr1 = { 	{ 'X', 'X', 'X' }, 
							{ ' ', 'O', ' ' }, 
							{ 'O', 'O', 'X' }
							};
		
		char[][] arr2 = { 	{ 'O', 'X', 'X' }, 
							{ ' ', 'O', 'X' }, 
							{ 'O', ' ', 'X' } 
							};
		
		char[][] arr3 = {	{ 'X', 'X', 'X' }, 
							{ 'X', 'O', ' ' }, 
							{ 'X', ' ', 'X' } 
							};
		TicTacToe tacToe = new TicTacToe(arr3);
		System.out.println(tacToe.checkRows());
		System.out.println(tacToe.checkColumns());
		System.out.println(tacToe.checkDiagonals());
	}
}
