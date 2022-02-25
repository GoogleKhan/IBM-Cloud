package constructor;

public class Car {

	public Car() {
		h = 5;
		w = 10;
	}

	public Car(int x, int y) {
		h = x;
		w = y;
	}

	int h;
	int w;

	void display() {
		System.out.println("Height = " + h + " and width = " + w);
	}

}
