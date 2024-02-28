
public abstract class Player {
	String name;
	char marker;
	abstract void makemove();
	boolean isValidMove(int row, int col) {
		boolean result = false;
		if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
			if (TicTacToe.Board[row][col] == ' ') {
				result = true;
			} else
				result = false;
		}
		return result;

	}

}
