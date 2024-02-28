import java.util.Scanner;

public class HumanPlayer extends Player {
	public HumanPlayer(String name, char Maker) {
		this.name = name;
		this.marker = Maker;
	}

	void makemove() {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		do {
			System.out.println("enter row number and col number:");
			row = sc.nextInt();
			col = sc.nextInt();
			/*
			 * the condition is if the place a move in to board the move is valid the loop
			 * will be iterate the condition is false because if already there a element the
			 * player wants to override chances so it can assist valid move or not and the
			 * user can gave to valid move on the board until the move is valid the move is
			 * invalid the condition !false so it is true go to DO block and next time ask
			 * the user input the input is valid the condition is !TRUE is false the loop
			 * will be exit and it is valid move
			 */
		} while (!isValidMove(row, col));
		TicTacToe.palceMaker(row, col, marker);

	}

}
