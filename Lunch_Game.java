
public class Lunch_Game {
	public static void StartGame(HumanPlayer p1, MchinePlayer machine, Player cp) {
		while (true) {
			if (TicTacToe.isBoardFull()) {
				System.out.println("the game is draw both palyer moves are equal");
				break;
			} else {
				System.out.println(cp.name + ": turn");
				cp.makemove();
				TicTacToe.Display();
				// check for who will win the game in every move

				if (TicTacToe.row_wise() || TicTacToe.column_wise() || TicTacToe.Diagonal()) {
					System.out.println(cp.name + ": is won the Game");
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
		TicTacToe t = new TicTacToe();
		HumanPlayer p1 = new HumanPlayer("bob", 'X');
		MchinePlayer machine = new MchinePlayer("machine", 'O');
		// reference obj we to using tracer if the who is the current mover
		Player cp;
		// in general first move is person 1 so i can put the p1 player
		// he is the current player

		cp = p1;
		StartGame(p1, machine, cp);

	}

}
