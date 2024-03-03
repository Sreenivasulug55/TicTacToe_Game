public class TicTacToe {

    // Declare 3X3 grid Board using a two-dimensional array
    public static char[][] board;

    public TicTacToe() {
        // Allocate memory for the board when an object is created
        board = new char[3][3];
        initBoard();
    }

    private void initBoard() {
        // Initialize the board with empty spaces
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public static void display() {
        System.out.println("-------------");
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void placeMarker(int row, int col, char marker) {
        // Check the bounds of the array before placing the marker
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = marker;
        } else {
            System.out.println("Invalid position");
        }
    }

    public static boolean rowWise() {
        // Check for winning condition in rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] != ' ' && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return true;
            }
        }
        return false;
    }

    public static boolean columnWise() {
        // Check for winning condition in columns
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] != ' ' && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }
        }
        return false;
    }

    public static boolean diagonal() {
        // Check for winning condition in diagonals
        if ((board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
                || (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            return true;
        }
        return false;
    }

    public static boolean isBoardFull() {
        // Check if the board is full
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static String results() {
        // Determine the result of the game
        if (rowWise()) {
            return "Row win";
        } else if (columnWise()) {
            return "Column win";
        } else if (diagonal()) {
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
