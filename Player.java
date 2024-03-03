
public abstract class Player {
	String name;
	char marker;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getMarker() {
		return marker;
	}
	public void setMarker(char marker) {
		this.marker = marker;
	}
	abstract void makemove();
	boolean isValidMove(int row, int col) {
		boolean result = false;
		if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
			if (TicTacToe.board[row][col] == ' ') {
				result = true;
			} else
				result = false;
		}
		return result;

	}

}
