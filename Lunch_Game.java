public class Lunch_Game {
    public static void startGame(HumanPlayer p1, MachinePlayer machine, Player cp) {
        while (true) {
            // First, check if the board is full or not
            if (TicTacToe.isBoardFull()) {
                System.out.println("The game is a draw. Both players' moves are equal.");
                break;
            } else {
                System.out.println(cp.getName() + ": turn");
                cp.makemove();
                TicTacToe.display();
                // Check if any player wins the game after each move
                if (TicTacToe.rowWise() || TicTacToe.columnWise() || TicTacToe.diagonal()) {
                    System.out.println(cp.getName() + ": has won the game!");
                    break;
                } else {
                	if (cp == p1) {
						cp = machine;
					} else {
						cp = p1;
					}
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the TicTacToe game
        TicTacToe t = new TicTacToe();
        // Create human and machine players
        HumanPlayer p1 = new HumanPlayer("Bob", 'X');
        MachinePlayer machine = new MachinePlayer("Machine", 'O');
        // Reference variable to keep track of the current player
        Player cp;
        // The first move is usually by player 1
        // so we initialize the current player to player 1
        cp = p1;
        // Start the game
        startGame(p1, machine, cp);
    }
}
