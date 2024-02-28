
public class TicTacToe {

	// declare 3X3 grid Board we are using two Dimensional Array
	static char Board[][];

	public TicTacToe() {
		// one a create a obj it self allocate the size of board
		Board = new char[3][3];
		InitBoard();
	}

	void InitBoard() {
		for (int row = 0; row < Board.length; row++) {
			for (int col = 0; col < Board.length; col++) {
				Board[row][col] = ' ';
			}
		}
	}

	static void Display() {
		System.out.println("-------------");
		for (int row = 0; row < Board.length; row++) {
			System.out.print("| ");
			for (int col = 0; col < Board.length; col++) {
				System.out.print(Board[row][col] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}

	}

	static void palceMaker(int row, int col, char marker) {
		// checks the bounds of an array
		if (row >= 0 && row <= 2 && col >= 0 && col <= 2)
			Board[row][col] = marker;

		else
			System.out.println("invalid position");
	}

	/*
	 * we want check who is the winner , checking for row wise and column wise and
	 * diagonal
	 */
	static boolean row_wise() {
		// columns are constant so we can check only rows

		for (int row = 0; row < Board.length; row++) {
			if (Board[row][0] != ' ' && Board[row][0] == Board[row][1] && Board[row][1] == Board[row][2]) {
				return true;
			}
		}
		return false;

	}

	static boolean column_wise() { 
		boolean result = false;

		for (int col = 0; col < Board.length; col++) {
			if (Board[0][col] != ' ' && Board[0][col] == Board[1][col] && Board[1][col] == Board[2][col]) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}

	static boolean Diagonal() {
		boolean result = false;
		if (Board[0][0] != ' ' && Board[0][0] == Board[1][1] && Board[1][1] == Board[2][2]
				|| Board[0][2] != ' ' && Board[0][2] == Board[1][1] && Board[1][1] == Board[2][0])
			result = true;

		return result;
	}

	static boolean isBoardFull() {
		for (int row = 0; row < Board.length; row++) {
			for (int col = 0; col < Board.length; col++) {
				if (Board[row][col] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	String Results() { 
		if (row_wise()) {
			return "row win";
		} else if (column_wise()) {
			return "column win";
		} else if (Diagonal()) {
			return "Diagonal win";
		} else {
			return "Draw the Match";
		}
	}

//	public static void main(String[] args) {
//		TicTacToe obj  = new TicTacToe();
//		obj.palceMaker(0, 0, 'X');
//		obj.palceMaker(2, 0, 'O');
//		obj.Display();
//		System.out.println(obj.Results());
//
//	}
}
