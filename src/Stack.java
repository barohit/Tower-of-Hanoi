
public class Stack {

	public Stack() {
		// TODO Auto-generated constructor stub
	}

	Disc head;

	public void push(Disc n) {
		if (head == null) {
			head = n;
			head.next = null;
		} else {
			n.next = head;
			head = n;
		}
	}

	public Disc pop() {
		Disc temp = head;
		head = head.next;
		return temp;
	}

	public Disc peek() {
		return head;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}

	}

}
