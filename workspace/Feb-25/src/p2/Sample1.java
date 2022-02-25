package p2;

public class Sample1 {

	int sum(int a, int b) {

		int c = a + b;
		return c;

	}

	void add(int a, int b) {

		int c = a + b;
		System.out.println(c);

	}

	static void sayHello() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {

		Sample1 sample1 = new Sample1();

		System.out.println("=======Calling add(5,6)============");
		sample1.add(5, 6);

		System.out.println("=======Calling sum(5,6)============");
		int x = sample1.sum(5, 6);
		System.out.println(x);
		
		
		Sample1.sayHello();

	}

}
