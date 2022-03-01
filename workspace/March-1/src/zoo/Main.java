package zoo;

public class Main {
	public static void main(String[] args) {

		Lion lion = new Lion();
		lion.eat();
		
		Cow cow = new Cow();
		cow.eat();
		
		Crow crow = new Crow();
		crow.eat();

		// Animal animal= new Animal(); // ERROR
	}
}
