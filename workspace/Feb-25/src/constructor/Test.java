package constructor;

public class Test {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.display();

		Car c2 = new Car();
		c2.display();

		Car c3 = new Car(50,100);
		c3.display();

//		c1.h = 10;
//		c1.w = 15;
//		c1.display();
	}

}
