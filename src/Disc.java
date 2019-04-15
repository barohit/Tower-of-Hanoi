
public class Disc {

	public Disc(int i) {
		length = i;
	}

// so basically, the only thing we know about a disc is, it's size, and it's position. 
	// a stack may be useful to solve this.
	int length;
	Rod current;
	Disc next;
}
