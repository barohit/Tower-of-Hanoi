import java.util.Scanner;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Game game = new Game();
		game.createGame(3);
		game.printRods();
		int moveCount = 0;
		while (game.endGame() == false) {
			System.out.println(
					"Enter the number for the origin rod and the destination rod. Left to right they are: 1, 2, 3");
			int origin = scan.nextInt();
			int destination = scan.nextInt();
			if (origin == 1 & destination == 2) {
				game.move(game.rod1, game.rod2);
			} else if (origin == 1 & destination == 3) {
				game.move(game.rod1, game.rod3);
			} else if (origin == 2 & destination == 3) {
				game.move(game.rod2, game.rod3);
			} else if (origin == 2 & destination == 1) {
				game.move(game.rod2, game.rod1);
			} else if (origin == 3 & destination == 1) {
				game.move(game.rod3, game.rod1);
			} else if (origin == 3 & destination == 2) {
				game.move(game.rod3, game.rod2);
			}
			moveCount++;
		}
		System.out.println("Congratulations, you win! You took " + moveCount + " moves!");
		scan.close();
	}
}
