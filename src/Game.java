
public class Game {

	public Game() {
		// TODO Auto-generated constructor stub
	}

	Rod rod1 = new Rod();
	Rod rod2 = new Rod();
	Rod rod3 = new Rod();

	public void createGame(int numDiscs) {
		for (int i = numDiscs; i > 0; i--) {
			rod1.s.push(new Disc(i));
		}
	}

	public void move(Rod origin, Rod destination) {
		if (destination.s.peek() == null) {
			destination.s.push(origin.s.pop());
		} else if (destination.s.peek().length > origin.s.peek().length && !(origin.s.isEmpty())) {
			destination.s.push(origin.s.pop());

		} else {
			System.out.println("Invalid move");
		}
		printRods();
	}

	public boolean endGame() {
		boolean result = false;
		if (rod1.s.isEmpty() == true) {
			if (rod2.s.isEmpty() == true) {
				Disc temp = rod3.s.head;
				while (temp.next != null) {
					if (temp.next.length > temp.length) {
						result = true;
						temp = temp.next;
					}
				}
			} else if (rod3.s.isEmpty() == true) {
				Disc temp = rod2.s.head;
				while (temp.next != null) {
					if (temp.next.length > temp.length) {
						result = true;
						temp = temp.next;
					}
				}
			}
		}
		return result;
	}

	public void printRods() {
		System.out.println();
		if (rod1.s.head != null) {
			Disc temp = rod1.s.head;
			while (temp.next != null) {
				System.out.println(temp.length);
				temp = temp.next;
			}
			System.out.println(temp.length);
		} else {
			System.out.println("Rod empty");
		}
		System.out.println();
		if (rod2.s.head != null) {
			Disc temp = rod2.s.head;
			while (temp.next != null) {
				System.out.println(temp.length);
				temp = temp.next;
			}
			System.out.println(temp.length);
		} else {
			System.out.println("Rod empty");
		}
		System.out.println();
		if (rod3.s.head != null) {
			Disc temp = rod3.s.head;
			while (temp.next != null) {
				System.out.println(temp.length);
				temp = temp.next;
			}
			System.out.println(temp.length);
		} else {
			System.out.println("Rod empty");
		}
		System.out.println("--------------");
	}
}
